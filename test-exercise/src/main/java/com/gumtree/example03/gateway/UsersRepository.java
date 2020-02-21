package com.gumtree.example03.gateway;

import com.gumtree.example03.model.DbUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.SortedMap;
import java.util.TreeMap;

public class UsersRepository implements UsersGateway{

    private final SortedMap<Long, DbUser> users;

    public UsersRepository() {
        users = new TreeMap<>();
        users.put(1L, DbUser.Builder.aDbUser().withId(1).withFirstname("James").withSurname("Moriarty")
                .withBirthDate(LocalDate.of(1976, 2, 29))
                .withDateCreated(LocalDate.now())
                .withDateCreated(LocalDate.now())
                .withIsPrivate(false)
                .build());

        users.put(2L, DbUser.Builder.aDbUser().withId(2).withFirstname("Sherlock").withSurname("Holmes")
                .withBirthDate(LocalDate.of(1982, 5, 12))
                .withDateCreated(LocalDate.now())
                .withDateCreated(LocalDate.now())
                .withAddressLine1("80 northside Wandsworth Common")
                .withAddressLine2("apartment 5")
                .withIsPrivate(true)
                .build());

        users.put(3L, DbUser.Builder.aDbUser().withId(3).withFirstname("John H.").withSurname("Watson")
                .withBirthDate(LocalDate.of(1963, 12, 3))
                .withDateCreated(LocalDate.now())
                .withDateCreated(LocalDate.now())
                .withIsPrivate(true)
                .build());
    }

    public List<DbUser> getAll(){
        return new ArrayList<>(users.values());
    }

    public Optional<DbUser> getById(long id){
        return (users.containsKey(id))?  Optional.of(users.get(id)) : Optional.empty();
    }
}
