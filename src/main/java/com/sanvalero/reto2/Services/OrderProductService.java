package com.sanvalero.reto2.Services;

import java.util.List;
import java.util.stream.Collectors;

import com.sanvalero.reto2.Repositories.Interfaces.OrderProductRepository;
import com.sanvalero.reto2.Services.Models.OrderProductDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderProductService {
    
    @Autowired
    private OrderProductRepository orderProductRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<OrderProductDTO> getAll() {
        return orderProductRepository.findAll().stream().map(x -> modelMapper.map(x, OrderProductDTO.class))
                .collect(Collectors.toList());
    }
}
