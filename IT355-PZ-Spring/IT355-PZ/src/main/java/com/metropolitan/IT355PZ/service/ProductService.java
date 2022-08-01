package com.metropolitan.IT355PZ.service;

import com.metropolitan.IT355PZ.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Integer idProduct);
    Product findByName(String name);
    Product save(Product product);
    Product update(Product product);
    void deleteById(Integer idProduct);
}