package com.sanvalero.reto2.Web.API;

import com.sanvalero.reto2.Services.OrderProductService;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderProductController {
    
    private static OrderProductService orderProductService;

    OrderProductController(OrderProductService orderProductService) {

        this.orderProductService = orderProductService;
    }
}
