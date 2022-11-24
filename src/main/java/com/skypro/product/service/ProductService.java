package com.skypro.product.service;

import com.skypro.product.repository.ProductRepository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(List<Integer> ids){
        this.productRepository.addProduct(ids);
    }


    public List<Integer> getAllProduct(){
         return this.productRepository.getAllProduct();
    }

}
