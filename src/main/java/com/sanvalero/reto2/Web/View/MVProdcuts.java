package com.sanvalero.reto2.Web.View;

import com.sanvalero.reto2.Services.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class MVProdcuts {
    private final ProductService productService;

    MVProdcuts(ProductService productService) {

        this.productService = productService;
    }
    
    @GetMapping("/productsss")
    public ModelAndView products(){
        ModelAndView modelo=new ModelAndView("Products");
    

        modelo.addObject("products", productService.getAll());
        return modelo;
    }
}
