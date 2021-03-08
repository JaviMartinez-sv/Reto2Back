package com.sanvalero.reto2.Web.Config;

import com.sanvalero.reto2.Repositories.Entities.Order;
import com.sanvalero.reto2.Repositories.Entities.OrderProduct;
import com.sanvalero.reto2.Repositories.Entities.Product;
import com.sanvalero.reto2.Repositories.Entities.Order.estates;
import com.sanvalero.reto2.Repositories.Interfaces.OrderProductRepository;
import com.sanvalero.reto2.Repositories.Interfaces.OrderRepository;
import com.sanvalero.reto2.Repositories.Interfaces.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(ProductRepository repositoryP, OrderRepository repositoryO, OrderProductRepository repositoryOP) {
        return args -> {
            repositoryP.save( new Product("Guitarra1", 50, "https://musicopolix.com/102506-large_default/bristol-guitarra-electroacustica-bd16ce.jpg"));
            repositoryP.save( new Product("Guitarra2", 38, "https://musicopolix.com/124357-large_default/fdaclflrcr.jpg" ));
            repositoryP.save( new Product("Guitarra3", 48, "https://musicopolix.com/102506-large_default/bristol-guitarra-electroacustica-bd16ce.jpg"));
            repositoryP.save( new Product("Guitarra4", 52, "https://musicopolix.com/124357-large_default/fdaclflrcr.jpg"));
            repositoryP.save( new Product("Guitarra5", 59, "https://musicopolix.com/102506-large_default/bristol-guitarra-electroacustica-bd16ce.jpg"));
            repositoryO.save( new Order("5/08/2020", "Javier", estates.ACEPTADO));
            repositoryO.save( new Order("18/08/2020", "Jose", estates.ENCURSO));
            repositoryO.save( new Order("2/08/2020", "Gabriel", estates.ENCURSO));
            repositoryO.save( new Order("6/08/2020", "Alex", estates.ENTREGADO));
            repositoryOP.save( new OrderProduct(3L, 4L, 2));
            repositoryOP.save( new OrderProduct(2L, 5L, 21) ); 
            repositoryOP.save( new OrderProduct(4L, 3L, 51) ); 
            repositoryOP.save( new OrderProduct(1L, 2L, 944) ); 

        };
    }
}

