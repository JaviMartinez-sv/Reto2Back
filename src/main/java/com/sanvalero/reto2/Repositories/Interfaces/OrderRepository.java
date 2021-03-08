package com.sanvalero.reto2.Repositories.Interfaces;

import java.util.List;

import com.sanvalero.reto2.Repositories.Entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {
   
    @Query(value = "SELECT o " + " FROM Orderrr o " + " WHERE o.id= :id")
    List<Order> findOById(@Param("id") Long id);  
}
