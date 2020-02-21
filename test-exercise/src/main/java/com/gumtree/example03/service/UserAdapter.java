package com.gumtree.example03.service;

import com.gumtree.example03.model.DbUser;
import com.gumtree.example03.model.User;

public interface UserAdapter {
    User adapt(DbUser dbUser);
}
