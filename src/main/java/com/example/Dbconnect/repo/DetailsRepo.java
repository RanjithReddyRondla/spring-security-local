package com.example.Dbconnect.repo;

import com.example.Dbconnect.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DetailsRepo extends JpaRepository<Details,Integer> {
    Details findByDetailName(String detailName);
    Details save(Details details);
    Details findByDetailId(int detailId);
    List<Details> findAll();
}
