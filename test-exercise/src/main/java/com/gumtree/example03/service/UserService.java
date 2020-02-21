package com.gumtree.example03.service;

import com.gumtree.example03.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUser(long userId);
}
