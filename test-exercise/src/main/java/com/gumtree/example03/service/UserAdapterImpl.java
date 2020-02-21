package com.gumtree.example03.service;

import com.gumtree.example03.model.DbUser;
import com.gumtree.example03.model.User;

public class UserAdapterImpl implements UserAdapter {

    public User adapt(DbUser dbUser){
        return User.Builder
                .aUser()
                .withId(dbUser.getId())
                .withFullName(getFullName(dbUser))
                .withIsPrivate(dbUser.isPrivate())
                .build();
    }

    private String getFullName(DbUser dbUser){
        return new StringBuilder()
                .append(dbUser.getFirstname())
                .append(" ")
                .append(dbUser.getSurname())
                .toString();
    }
}
