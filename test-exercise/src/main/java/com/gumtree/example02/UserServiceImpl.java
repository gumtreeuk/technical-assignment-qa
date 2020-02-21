package com.gumtree.example02;


import java.util.Optional;

public class UserServiceImpl  {

    private final UsersGateway usersGateway;
    private final UserAdapter userAdapter;

    public UserServiceImpl(UsersGateway usersGateway, UserAdapter userAdapter) {
        this.usersGateway = usersGateway;
        this.userAdapter = userAdapter;
    }

    public Optional<User> getUser(long userId) {
        Optional<DbUser> dbUser = usersGateway.getById(userId);
        if (dbUser.isPresent()){
            return Optional.of(userAdapter.adapt(dbUser.get()));
        }
        return Optional.empty();
    }
}