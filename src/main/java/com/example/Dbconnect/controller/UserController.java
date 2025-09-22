package com.example.Dbconnect.controller;

import com.example.Dbconnect.model.Users;
import com.example.Dbconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @GetMapping("/users")
    public List<Users> getUser() {
        return userService.getUsers();
    }

    @PostMapping("/PostUser")
    public Users postUser(@RequestBody Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userService.addUser(user);
    }
    @GetMapping("/getUserById")
    public Users getUserById(@RequestParam int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        System.out.println("Login attempt for user: " + user.getUsername());
        return userService.verifyUser(user);
    }
}
