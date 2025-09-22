package com.example.Dbconnect.controller;

import com.example.Dbconnect.model.Details;
import com.example.Dbconnect.service.DetailsService;
import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetailsController {

    @Autowired
    DetailsService detailsService;

    @GetMapping("/getDetails")
    public List<Details> getDetails() {
        return detailsService.getAllDetails();
    }

    @PostMapping("/postDetails")
    public Details postDetails(@RequestBody Details details) {

        System.out.println("Details posted successfully");
        return  detailsService.saveDetails(details);
    }

    @GetMapping
    public Details getDetailsById(int id) {
        return detailsService.getDetailsById(id);
    }

//    @GetMapping("/CSRF")
//    public CsrfToken csrf(HttpServletRequest servletRequest) {
//        return (CsrfToken)servletRequest.getAttribute("_csrf");
//    }
}
