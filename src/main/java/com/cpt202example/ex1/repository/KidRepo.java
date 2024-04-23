package com.cpt202example.ex1.repository;

import com.cpt202example.ex1.model.Kid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ricky
 **/
@Repository
public interface KidRepo extends JpaRepository<Kid,Integer> {

}
