package com.skypro.product.controller;

import com.skypro.product.model.Product;
import com.skypro.product.record.ProductRequest;
import com.skypro.product.service.Basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final Basket basket;

    public ProductController(Basket basket) {this.basket = basket;}

  @GetMapping("/basket")
    public List<Product> getAllProduct(){
        return this.basket.getAllProduct();
  }

  @PostMapping("/basket")
  public List<Product> addProduct(@RequestBody ProductRequest productRequest){
        return this.basket.addProduct(productRequest);
    }

}
