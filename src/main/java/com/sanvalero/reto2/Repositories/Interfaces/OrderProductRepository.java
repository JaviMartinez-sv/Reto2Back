package com.sanvalero.reto2.Repositories.Interfaces;

import com.sanvalero.reto2.Repositories.Entities.OrderProduct;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
    
}
