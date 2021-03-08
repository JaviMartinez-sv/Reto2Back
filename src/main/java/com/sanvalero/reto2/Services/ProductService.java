package com.sanvalero.reto2.Services;

import java.util.List;
import java.util.stream.Collectors;

import com.sanvalero.reto2.Repositories.Interfaces.ProductRepository;
import com.sanvalero.reto2.Services.Models.ProductDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDTO> getAll() {
        return productRepository.findAll().stream().map(x -> modelMapper.map(x, ProductDTO.class))
                .collect(Collectors.toList());
    }
}
