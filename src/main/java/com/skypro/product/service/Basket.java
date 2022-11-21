package com.skypro.product.service;

import com.skypro.product.model.Product;
import com.skypro.product.record.ProductRequest;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(scopeName = "prototype")
//@Scope(scopeName = "Session")
public class Basket {
    List<Product> basket = new ArrayList<>();

    public List<Product> getAllProduct() {
        return this.basket;
    }
    public List<Product> addProduct(ProductRequest productRequest){
        if (productRequest == null){
            throw new IllegalArgumentException("barcode should be set");
        }
        Product product = new Product(productRequest.getBarcode());
        this.basket.add(product);
        return basket;
    }
}
