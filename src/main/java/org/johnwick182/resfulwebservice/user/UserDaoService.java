package org.johnwick182.resfulwebservice.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "John", new Date()));
        users.add(new User(3, "Anne", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    public User findOne(int id) {
        return users.stream().filter(user1 -> user1.getId().equals(id)).findAny().orElse(null);
    }

    public ResponseEntity<User> delete(int id) {
        if (users.removeIf(user -> user.getId() == id)) {
            System.out.println("deleted");
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    //lesson 19

}
