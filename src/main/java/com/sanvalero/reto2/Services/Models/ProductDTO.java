package com.sanvalero.reto2.Services.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sanvalero.reto2.Repositories.Entities.Product;

public class ProductDTO {

    
    public ProductDTO(){}

    private @Id @GeneratedValue Long id;
    private String Name; 
    private int Price; 
    private String Image;

    public ProductDTO(final String _name, final int _price, final String _image){
       
       
        this.Name = _name;
        this.Price = _price;
        this.Image = _image;
    }
    public ProductDTO (ProductDTO product){
      
        this.Name = product.Name;
        this.Price = product.Price;
        this.Image = product.Image;
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
        return "Product [Id=" + id + ", Name=" + Name + ", Price=" + Price + ",Image=" + Image + "]";
    }

    public Product toProduct() {
        return new Product(
            this.id,
            this.Name,
            this.Price,
            this.Image
        );
    }


}
