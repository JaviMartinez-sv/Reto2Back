package com.sanvalero.reto2.Repositories.Interfaces;

import java.util.List;

import com.sanvalero.reto2.Repositories.Entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
    @Query(value = "SELECT p " + " FROM Product p " + " WHERE p.id= :id")
    List<Product> findPById(@Param("id") Long id);  
}
