package com.metropolitan.IT355PZ.repository;

import com.metropolitan.IT355PZ.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
    Product findByIdProduct(Integer idProduct);
}