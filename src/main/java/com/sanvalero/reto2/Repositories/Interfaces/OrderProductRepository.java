package com.sanvalero.reto2.Repositories.Interfaces;

import java.util.List;

import com.sanvalero.reto2.Repositories.Entities.OrderProduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
    
    // Encontrar pedido por id
    @Query(value = "SELECT op " + " FROM OrderProduct op " + " WHERE op.Idorder= :id")
    List<OrderProduct> findByOId(@Param("id") Long id);

    //Encontrar pedido por id y product por id
    @Query(value = "SELECT op " + " FROM OrderProduct op " + " WHERE op.Idorder= :id AND op.Idproduct= :Idproduct")
    List<OrderProduct> findByOIdPId(@Param("id") Long id, @Param("Idproduct") Long Idproduct);
}
