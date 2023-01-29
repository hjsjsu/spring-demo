package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getUser() {
        return userService.findAll();
    }
    @GetMapping("/detail")
    public User getUserById(Integer id) {
        return userService.findOne(id);
    }
    @PostMapping("/update")
    public String updateUser(@RequestBody User user) {
        return userService.update(user);
    }
    @PostMapping("/submit")
    public String submitUser(@RequestBody User user) {
        return userService.submit(user);
    }
    @PostMapping("/remove")
    public String removeUser(Integer id) {
        return userService.removeById(id);
    }
}
