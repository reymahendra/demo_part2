package com.pusiknas.service;

import java.util.Arrays;
import java.util.List;

import com.pusiknas.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    private static List<Product> products = Arrays.asList(
        new Product(1L, "001", "Product 001", 11000.0),
        new Product(2L, "002", "Product 002", 21000.0),
        new Product(3L, "003", "Product 003", 31000.0),
        new Product(4L, "004", "Product 004", 41000.0),
        new Product(5L, "005", "Product 005", 51000.0)       
    );

    public List<Product> findAll(){
        return products;
    }
}
