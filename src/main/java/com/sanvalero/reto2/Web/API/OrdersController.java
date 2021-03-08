package com.sanvalero.reto2.Web.API;

import java.util.List;


import com.sanvalero.reto2.Services.OrderService;

import com.sanvalero.reto2.Services.Models.OrderDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    


    private static OrderService orderService;

    OrdersController(OrderService orderService) {

        this.orderService = orderService;

    }


    @GetMapping("/orderController")
    public List<OrderDTO> Get() {

        return orderService.getAll();
    }
}
