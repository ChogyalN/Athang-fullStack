package com.jdbcathang01.athangfullstack01.controller;

import com.jdbcathang01.athangfullstack01.entity.Product;
import com.jdbcathang01.athangfullstack01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("addProduct")
    private Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("getProduct")
    private List<Product> getProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("ggetProductById/{id}")
    private Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PutMapping("updateProduct/{id}")
    private Product updateProduct(@PathVariable int id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("deleteProduct/{id}")
    private void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }
}
