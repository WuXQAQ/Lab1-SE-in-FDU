package org.lab.lab1.service;

import org.lab.lab1.pojo.User;

import java.util.List;

public interface UserService {
    public User findById(Integer id);

    public List<User> findAll();

    void addUser(User user);

    void changeUser(User user);

    void deleteUser(Integer id);
}
