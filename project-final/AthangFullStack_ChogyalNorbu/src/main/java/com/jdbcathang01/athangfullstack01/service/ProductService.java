package com.jdbcathang01.athangfullstack01.service;

import com.jdbcathang01.athangfullstack01.entity.Product;
import com.jdbcathang01.athangfullstack01.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    // Read
    public Product getProductById(long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Update
    public Product updateProduct(long id, Product updatedProduct) {
        Product existingProduct = getProductById(id);
        existingProduct.setProductName(updatedProduct.getProductName());
        existingProduct.setPrice(updatedProduct.getPrice());
        // Set other fields as needed
        return productRepository.save(existingProduct);
    }

    // Delete
    public void deleteProduct(int id) {
        Product existingProduct = getProductById(id);
        productRepository.delete(existingProduct);
    }
}
