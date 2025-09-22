package com.example.Dbconnect.repo;

import com.example.Dbconnect.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
    Users save(Users users);
    Users findById(int userId);
    List<Users> findAll();
}
