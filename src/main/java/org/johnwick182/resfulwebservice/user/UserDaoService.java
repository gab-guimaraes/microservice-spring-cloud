package org.johnwick182.resfulwebservice.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "John", new Date()));
        users.add(new User(3, "Anne", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        return users.stream().filter(user1 -> user1.getId().equals(id)).findAny().orElse(null);
    }

    //lesson 19

}
