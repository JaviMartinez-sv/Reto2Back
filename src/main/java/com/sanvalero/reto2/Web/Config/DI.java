package com.sanvalero.reto2.Web.Config;

import com.sanvalero.reto2.Services.OrderProductService;
import com.sanvalero.reto2.Services.OrderService;
import com.sanvalero.reto2.Services.ProductService;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DI {
    
    @Bean
    ProductService createProductService() {
        return new ProductService();
    }

    @Bean
    OrderService createOrderService() {
        return new OrderService();
    }
   

    @Bean
    OrderProductService createOrderProduct() {
        return new OrderProductService();
    }
   

    @Bean
    ModelMapper createModelMapper() {

        return new ModelMapper();
    }

}
