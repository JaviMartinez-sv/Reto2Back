package com.sanvalero.reto2.Web.API;

import java.util.List;

import com.sanvalero.reto2.Services.ProductService;
import com.sanvalero.reto2.Services.Models.ProductDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  private ProductService productService;

  ProductController(ProductService productService) {

    this.productService = productService;
  }
  /*
   * @GetMapping("/products") public List<ProductDTO> Get() { return
   * productService.getAll(); }
   */

  // Muestro Productos por id
  @GetMapping("/productsbyid/{id}")
  public List<ProductDTO> Get(@PathVariable("id") final Long id) {

    return productService.getByPid(id);
  }

}
