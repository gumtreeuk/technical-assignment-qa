package com.gumtree.example03.service;

import com.gumtree.example03.gateway.AdvertsGateway;
import com.gumtree.example03.model.Advert;
import com.gumtree.example03.model.User;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class AdvertServiceImpl implements AdvertService {

    private final UserService userService;
    private final AdvertsGateway advertsGateway;

    public AdvertServiceImpl(UserService userService, AdvertsGateway advertsGateway) {
        this.userService = userService;
        this.advertsGateway = advertsGateway;
    }

    @Override
    public List<Advert> getAdverts(long sellerId) {
        return advertsGateway.getAll().stream()
                .filter(ad -> ad.getUserId() == sellerId)
                .collect(Collectors.toList());
    }

    @Override
    public boolean canRepostForFree(long advertId) throws RuntimeException {
        Optional<Advert> advert = advertsGateway.getById(advertId);
        if (!advert.isPresent()){
            throw new NoSuchElementException("Advert with id " + advertId + "not found");
        }

        Optional<User> user = userService.getUser(advert.get().getUserId());
        if (!user.isPresent()){
            throw new NoSuchElementException("User with id " + advert.get().getUserId() + "not found");
        }


        long nbNonExpiredAds = getAdverts(user.get().getId()).stream()
                .filter(ad -> !ad.isExpired())
                .count();

        return user.get().isPrivate() && nbNonExpiredAds==0;
    }

    @Override
    public void repostForFree(long advertId) throws RuntimeException {
        if (!canRepostForFree(advertId)){
            throw new IllegalStateException("Cannot repost this advert for free");
        }

        Optional<Advert> advert = advertsGateway.getById(advertId);

        if (!advert.isPresent()){
            throw new NoSuchElementException("Advert with id " + advertId + "not found");
        }

        advertsGateway.updateAdvert(advert.get().getBuilder().withIsExpired(false).build());
    }
}
