package com.sanvalero.reto2.Repositories.Entities;

public class ProductQuantity {

    
    private Product product;
    private int quantity;
 
    
    public ProductQuantity() {
    }

    public ProductQuantity(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
 
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 
}
