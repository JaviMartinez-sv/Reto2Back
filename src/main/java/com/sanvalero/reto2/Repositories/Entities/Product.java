package com.sanvalero.reto2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//BBDD
@Table(name = "Product") 
//Memory
@Entity(name = "Product") 

public class Product {
    
    private @Id @GeneratedValue Long id;
    private String Name; 
    private int Price; 
    private String Image;



    public Product(final String _name, final int _price, final String _image){
        this.Name = _name;
        this.Price = _price;
        this.Image = _image;
    }

    public Product(final Long _id, final String _name, final int _price, final String _image){
        this.id = _id;
        this.Name = _name;
        this.Price = _price;
        this.Image = _image;
    }

    public Product (Product product){
      
        this.Name = product.Name;
        this.Price = product.Price;
        this.Image = product.Image;
    }

    public Product(){

    }

  
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product [Id=" + id + ", Name=" + Name + ", Price=" + Price + ", Image=" + Image + "]";
    }

    
}
