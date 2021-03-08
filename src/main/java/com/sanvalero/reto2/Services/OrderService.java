package com.sanvalero.reto2.Services;

import java.util.List;
import java.util.stream.Collectors;

import com.sanvalero.reto2.Repositories.Interfaces.OrderRepository;
import com.sanvalero.reto2.Services.Models.OrderDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<OrderDTO> getAll() {
        return orderRepository.findAll().stream().map(x -> modelMapper.map(x, OrderDTO.class))
                .collect(Collectors.toList());
    }

    public List<OrderDTO> findById(Long id){
        return orderRepository.findOById(id).stream().map(x -> modelMapper.map(x, OrderDTO.class)).collect(Collectors.toList());

    }

}
