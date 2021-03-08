package com.sanvalero.reto2.Web.Config;

import com.sanvalero.reto2.Repositories.Entities.Product;
import com.sanvalero.reto2.Repositories.Interfaces.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(ProductRepository repository) {
        return args -> {
            repository.save( new Product("Guitarra1", 50, "https://musicopolix.com/102506-large_default/bristol-guitarra-electroacustica-bd16ce.jpg"));
            repository.save( new Product("Guitarra2", 38, "https://musicopolix.com/124357-large_default/fdaclflrcr.jpg" ));
            repository.save( new Product("Guitarra3", 48, "https://musicopolix.com/102506-large_default/bristol-guitarra-electroacustica-bd16ce.jpg"));
            repository.save( new Product("Guitarra4", 52, "https://musicopolix.com/124357-large_default/fdaclflrcr.jpg"));
            repository.save( new Product("Guitarra5", 59, "https://musicopolix.com/102506-large_default/bristol-guitarra-electroacustica-bd16ce.jpg"));
        };
    }
}

