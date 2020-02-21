package com.gumtree.example03.gateway;

import com.gumtree.example03.model.Advert;

import java.util.List;
import java.util.Optional;

public interface AdvertsGateway {

    List<Advert> getAll();

    Optional<Advert> getById(long advertId) throws RuntimeException;

    void updateAdvert(Advert advert);
}
