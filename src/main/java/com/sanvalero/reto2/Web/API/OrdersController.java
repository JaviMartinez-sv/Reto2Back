package com.sanvalero.reto2.Web.API;

import java.util.ArrayList;
import java.util.List;

import com.sanvalero.reto2.Repositories.Entities.OrderProductM;
import com.sanvalero.reto2.Repositories.Entities.ProductPut;
import com.sanvalero.reto2.Repositories.Entities.ProductQuantity;
import com.sanvalero.reto2.Services.OrderProductService;
import com.sanvalero.reto2.Services.OrderService;
import com.sanvalero.reto2.Services.ProductService;
import com.sanvalero.reto2.Services.Models.OrderDTO;
import com.sanvalero.reto2.Services.Models.OrderProductDTO;
import com.sanvalero.reto2.Services.Models.ProductDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    
    private static OrderService orderService;
    private static OrderProductService orderProductService;
    private static ProductService productService;



    OrdersController(OrderService orderService, OrderProductService orderProductService,
    ProductService productService) {

        this.orderService = orderService;
        this.orderProductService = orderProductService;
        this.productService = productService;
}


    @GetMapping("/orderController")
    public List<OrderDTO> Get() {

        return orderService.getAll();
    }

    @GetMapping("/order/{id}")
    public static OrderProductM orderById(@PathVariable("id") final Long id) {
        List<OrderDTO> orders = orderService.findById(id);
        OrderDTO orderDto = null;

        if (!orders.isEmpty()) {
            orderDto = orders.get(0);
        } else {
            return null;
        }

        List<OrderProductDTO> orderProductsDTO = orderProductService.findByOId(id);

        ArrayList<ProductQuantity> products = new ArrayList<ProductQuantity>();
        for (OrderProductDTO orderProductDTO : orderProductsDTO) {
            ProductDTO productDTO = productService.getByPid(orderProductDTO.getIdProduct()).get(0);
            ProductQuantity productQuantity = new ProductQuantity(productDTO.toProduct(), orderProductDTO.getQuantity());
            products.add(productQuantity);
        }
        
        return new OrderProductM(orderDto.toOrder(), products);        
    }


     //-	Permite editar un pedido añadiendo o eliminando productos en ese pedido
   @PutMapping("/orderss/{id}")
   public void Update(@RequestBody ProductPut product, @PathVariable("id") Long id) {
        orderProductService.deleteByOP(id, product.getId());
        if (product.getQuantity() > 0) {
            orderProductService.add(new OrderProductDTO(id, product.getId(), product.getQuantity()));
        }
   }
}
