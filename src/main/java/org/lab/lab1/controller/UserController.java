package org.lab.lab1.controller;

import org.lab.lab1.pojo.Result;
import org.lab.lab1.pojo.User;
import org.lab.lab1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public Result addUser(@RequestBody User user) {
        userService.addUser(user);
        return Result.success();


    }

    @GetMapping("/user")
    public User findById(@RequestHeader(name = "Authorization") Integer token) {
        return userService.findById(token);
    }

    @GetMapping("/user/all")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PutMapping("/user")
    public Result changeUser(@RequestBody User user) {
        userService.changeUser(user);
        return Result.success();
    }

    @DeleteMapping("/user")
    public Result deleteUser(@RequestBody Integer id) {
        userService.deleteUser(id);
        return Result.success();
    }
}
