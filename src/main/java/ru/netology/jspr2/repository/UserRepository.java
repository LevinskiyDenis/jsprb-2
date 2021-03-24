package ru.netology.jspr2.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    ConcurrentHashMap<String, String> users;

    public UserRepository(ConcurrentHashMap<String, String> users) {
        this.users = users;
    }

    public List<Authorities> getAuthorities(String user, String password) {

        if (users.get(user) == null || !users.get(user).equals(password)) {
            return new ArrayList<>();
        }

        return Arrays.asList(Authorities.values());
    }

}
