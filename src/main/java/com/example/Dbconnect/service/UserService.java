package com.example.Dbconnect.service;

import com.example.Dbconnect.model.Users;
import com.example.Dbconnect.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    JwtService jwtService;

    @Autowired
    AuthenticationManager authenticationManager;

    public List<Users> getUsers() {
        return userRepo.findAll();
    }

    public Users addUser(Users user) {
        return userRepo.save(user);
    }

    public Users getUserById(int id) {
        return userRepo.findById(id);
    }

    public Users getUserByName(String name) {
        return userRepo.findByUsername(name);
    }

    public String verifyUser(Users user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(), user.getPassword())
        );
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername());
        } else {
            return "Authentication failed";
        }
    }
}
