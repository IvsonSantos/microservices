package com.webservices.webservices.service;

import com.webservices.webservices.model.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {

        users.add(User.builder()
                .id(1)
                .name("Adam")
                .birthDate(LocalDate.now().minusYears(1))
                .build()
        );
        users.add(User.builder()
                .id(2)
                .name("Eva")
                .birthDate(LocalDate.now().minusYears(1))
                .build()
        );
        users.add(User.builder()
                .id(3)
                .name("Maria")
                .birthDate(LocalDate.now().minusYears(1))
                .build()
        );
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
