package com.example.Dbconnect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Details {
    @Id
    private int detailId;
    private String detailName;
    private String detailDesc;
    private String detailType;
}
