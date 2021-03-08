package com.sanvalero.reto2.Repositories.Interfaces;

import com.sanvalero.reto2.Repositories.Entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
