package com.sanvalero.reto2.Repositories.Interfaces;

import com.sanvalero.reto2.Repositories.Entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
