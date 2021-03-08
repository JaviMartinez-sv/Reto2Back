package com.sanvalero.reto2.Services;

import java.util.List;
import java.util.stream.Collectors;

import com.sanvalero.reto2.Repositories.Entities.OrderProduct;
import com.sanvalero.reto2.Repositories.Interfaces.OrderProductRepository;
import com.sanvalero.reto2.Services.Models.OrderProductDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderProductService {
    
    @Autowired
    private OrderProductRepository orderProductRepository;
    @Autowired
    private ModelMapper modelMapper;

    // Saca todo OP

    public List<OrderProductDTO> getAll() {
        return orderProductRepository.findAll().stream().map(x -> modelMapper.map(x, OrderProductDTO.class))
                .collect(Collectors.toList());
    }


    public List<OrderProductDTO> findByOId(Long id) {
        return orderProductRepository.findByOId(id).stream().map(x -> modelMapper.map(x, OrderProductDTO.class))
                .collect(Collectors.toList());
    }
    
    public OrderProductDTO add(OrderProductDTO orderProduct) {
        OrderProduct entityToInsert = modelMapper.map(orderProduct, OrderProduct.class);
        OrderProduct result = orderProductRepository.save(entityToInsert);
        return modelMapper.map(result, OrderProductDTO.class);
    }

    public void deleteByOP(Long Idorder, Long Idproduct) {
        List<OrderProduct> entityToDelete = orderProductRepository.findByOIdPId(Idorder, Idproduct);
        if (!entityToDelete.isEmpty()) {
            orderProductRepository.delete(entityToDelete.get(0));
        }

    }

}
