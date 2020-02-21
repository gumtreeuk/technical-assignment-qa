package com.gumtree.example02;

import java.util.List;
import java.util.Optional;

public interface UsersGateway {

    List<DbUser> getAll();

    Optional<DbUser> getById(long userId);
}
