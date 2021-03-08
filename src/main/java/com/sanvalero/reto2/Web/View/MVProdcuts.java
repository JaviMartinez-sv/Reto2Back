package com.sanvalero.reto2.Web.View;

import java.util.ArrayList;

import com.sanvalero.reto2.Repositories.Entities.OrderProductM;
import com.sanvalero.reto2.Repositories.Entities.ProductQuantity;
import com.sanvalero.reto2.Services.ProductService;
import com.sanvalero.reto2.Web.API.OrdersController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class MVProdcuts {
    private final ProductService productService;

    MVProdcuts(ProductService productService) {

        this.productService = productService;
    }
    
    @GetMapping("/productsola")
    public ModelAndView products(){
        ModelAndView modelo=new ModelAndView("productsList");
        OrderProductM order = OrdersController.orderById( 3L);
        ArrayList<Long> ids = new ArrayList<Long>();
     /*   
        for (final ProductQuantity producto: order.getProducts()){
            ids.add(producto.getProduct().getId());
            
        }
        */

        modelo.addObject("products", productService.getAll());
        modelo.addObject("order", order);
        modelo.addObject("ids", ids);
        return modelo;
    }
}
