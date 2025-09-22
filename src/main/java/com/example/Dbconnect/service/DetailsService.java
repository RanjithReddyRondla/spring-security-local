package com.example.Dbconnect.service;

import com.example.Dbconnect.model.Details;
import com.example.Dbconnect.repo.DetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsService {
    @Autowired
    DetailsRepo detailsRepo;

    public Details saveDetails(Details details){
        return detailsRepo.save(details);
    }
    public Details getDetailsById(int id){
        return detailsRepo.findByDetailId(id);
    }
    public Details getDetailsByName(String name) {
        return detailsRepo.findByDetailName(name);
    }
    public java.util.List<Details> getAllDetails(){
        return detailsRepo.findAll();
    }
}
