package com.example.Dbconnect.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbConnectController {

    @GetMapping("/details")
    public String getDetails(HttpServletRequest servletRequest) {
        return "Hello, World!"+servletRequest.getSession().getId();
    }
}
