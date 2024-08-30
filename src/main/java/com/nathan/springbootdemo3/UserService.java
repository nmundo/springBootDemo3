package com.nathan.springbootdemo3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1, "Nathan", "nathan@test.org"));
        users.add(new User(2, "Chris", "chris@test.org"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(int userId) {
        for (User u : users) {
            if (u.getId() == userId) {
                return u;
            }
        }
        return null;
    }

    public void deleteUser(int userId) {
        users.removeIf(u -> u.getId() == userId);
    }
}
