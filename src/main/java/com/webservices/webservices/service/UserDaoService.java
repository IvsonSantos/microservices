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

    private static int userCount = 0;

    static {

        users.add(User.builder()
                .id(1)
                .name("Adam")
                .birthDate(LocalDate.now().minusYears(1))
                .build()
        );
        ++userCount;
        users.add(User.builder()
                .id(2)
                .name("Eva")
                .birthDate(LocalDate.now().minusYears(1))
                .build()
        );
        ++userCount;
        users.add(User.builder()
                .id(3)
                .name("Maria")
                .birthDate(LocalDate.now().minusYears(1))
                .build()
        );
        ++userCount;
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }

}
