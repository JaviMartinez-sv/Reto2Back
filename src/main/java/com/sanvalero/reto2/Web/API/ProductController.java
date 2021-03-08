package com.sanvalero.reto2.Web.API;

import java.util.List;

import com.sanvalero.reto2.Services.ProductService;
import com.sanvalero.reto2.Services.Models.ProductDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private  static ProductService productService;

    ProductController(ProductService productService) {

        this.productService = productService;
    }

    @GetMapping("/products")
    public List<ProductDTO> Get() {
      return productService.getAll();
    }
}

    

