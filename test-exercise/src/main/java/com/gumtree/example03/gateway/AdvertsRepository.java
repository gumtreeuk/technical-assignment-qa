package com.gumtree.example03.gateway;

import com.gumtree.example03.model.Advert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.SortedMap;
import java.util.TreeMap;

public class AdvertsRepository implements AdvertsGateway {

    private final SortedMap<Long, Advert> adverts;

    public AdvertsRepository() {
        adverts = new TreeMap<>();
        adverts.put(1L, Advert.Builder.anAdvert().withId(1).withUserId(1).withIsExpired(false).withDescription("A first ad").build());
        adverts.put(2L, Advert.Builder.anAdvert().withId(2).withUserId(1).withIsExpired(false).withDescription("A second ad").build());
        adverts.put(3L, Advert.Builder.anAdvert().withId(3).withUserId(1).withIsExpired(true).withDescription("A third ad").build());
        adverts.put(4L, Advert.Builder.anAdvert().withId(4).withUserId(1).withIsExpired(true).withDescription("Such a beautifull car").build());
        adverts.put(5L, Advert.Builder.anAdvert().withId(5).withUserId(1).withIsExpired(false).withDescription("The fanciest chessboard in the world").build());
        adverts.put(6L, Advert.Builder.anAdvert().withId(6).withUserId(2).withIsExpired(false).withDescription("Best outcall massage service in west London").build());
        adverts.put(7L, Advert.Builder.anAdvert().withId(7).withUserId(2).withIsExpired(false).withDescription("Toyota Mercedes Yaris, good Quality").build());
        adverts.put(8L, Advert.Builder.anAdvert().withId(8).withUserId(2).withIsExpired(true).withDescription("A table. That's it").build());
        adverts.put(9L, Advert.Builder.anAdvert().withId(9).withUserId(3).withIsExpired(true).withDescription("Vintage Alice in wonderland doll").build());
        adverts.put(10L, Advert.Builder.anAdvert().withId(10).withUserId(3).withIsExpired(true).withDescription("4 chairs in excellent condition").build());
    }

    public List<Advert> getAll(){
        return new ArrayList<>(adverts.values());
    }

    public Optional<Advert> getById(long id){
        return (adverts.containsKey(id))?  Optional.of(adverts.get(id)) : Optional.empty();
    }

    @Override
    public void updateAdvert(Advert advert) {
        adverts.put(advert.getId(), advert);
    }
}
