package com.sanvalero.reto2.Services.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class OrderProductDTO {
    
    private @Id @GeneratedValue Long id;
    public Long Idorder;
    public Long Idproduct;
    private int quantity;
    



    
    public OrderProductDTO() {
	}

    public OrderProductDTO(Long Idorder, Long Idproduct, int quantity) {
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
