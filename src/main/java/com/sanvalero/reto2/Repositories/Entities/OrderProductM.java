package com.sanvalero.reto2.Repositories.Entities;

import java.util.ArrayList;

public class OrderProductM {

    private Order order;
    private ArrayList<ProductQuantity>products;
 

 
    public OrderProductM(Order order, ArrayList<ProductQuantity> products) {
        this.order = order;
        this.products = products;
    }

    public OrderProductM() {
    }
 
    public Order getOrder() {
        return order;
    }
 
    public void setOrder(Order order) {
        this.order = order;
    }
 
    public ArrayList<ProductQuantity> getProducts() {
        return products;
    }
 
    public void setProducts(ArrayList<ProductQuantity> products) {
        this.products = products;
    }
}
