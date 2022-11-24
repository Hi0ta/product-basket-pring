package com.skypro.product.controller;
import com.skypro.product.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam("id") List<Integer> ids){
     this.productService.addProduct(ids);

    }

  @GetMapping("/get")
    public List<Integer> getAllProduct(){
                return this.productService.getAllProduct();
  }

}
