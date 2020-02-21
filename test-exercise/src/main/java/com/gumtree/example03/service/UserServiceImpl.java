package com.gumtree.example03.service;

import com.gumtree.example03.gateway.UsersGateway;
import com.gumtree.example03.model.DbUser;
import com.gumtree.example03.model.User;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UsersGateway usersGateway;
    private final UserAdapter userAdapter;

    public UserServiceImpl(UsersGateway usersGateway, UserAdapter userAdapter) {
        this.usersGateway = usersGateway;
        this.userAdapter = userAdapter;
    }

    @Override
    public Optional<User> getUser(long userId) {
        Optional<DbUser> dbUser = usersGateway.getById(userId);
        if (dbUser.isPresent()){
            return Optional.of(userAdapter.adapt(dbUser.get()));
        }
        return Optional.empty();
    }
}
