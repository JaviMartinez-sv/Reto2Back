package com.sanvalero.reto2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//BBDD
@Table(name = "OrderProduct") 
//Memory
@Entity(name = "OrderProduct")

public class OrderProduct {

    public Long Idorder;
    public Long Idproduct;
    private int quantity;
    //Autoincremental
    private @Id @GeneratedValue Long id;



    
    public OrderProduct() {
	}

    public OrderProduct(Long Idorder, Long Idproduct, int quantity) {
        this.Idorder = Idorder;
        this.Idproduct = Idproduct;
        this.quantity = quantity;
    }

    public Long getIdOrder() {
        return Idorder;
    }

    public void setIdOrder(Long Idorder) {
        this.Idorder = Idorder;
    }

    public Long getIdProduct() {
        return Idproduct;
    }

    public void setIdProduct(Long Idproduct) {
        this.Idproduct = Idproduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
