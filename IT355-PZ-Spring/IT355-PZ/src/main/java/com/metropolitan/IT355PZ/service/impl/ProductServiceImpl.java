package com.metropolitan.IT355PZ.service.impl;

import com.metropolitan.IT355PZ.entity.Product;
import com.metropolitan.IT355PZ.repository.ProductRepository;
import com.metropolitan.IT355PZ.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer idProduct) {
        return productRepository.findByIdProduct(idProduct);
    }
    
    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteById(Integer idProduct) {
        productRepository.deleteById(idProduct);
    }
    
}