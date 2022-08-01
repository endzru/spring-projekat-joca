package com.metropolitan.IT355PZ.controller;

import com.metropolitan.IT355PZ.entity.Product;
import com.metropolitan.IT355PZ.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {
    
    private final ProductService productService;
    
    @GetMapping("")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok().body(productService.findAll()); // get product list
    }
    
    @GetMapping("/{product}")
    public ResponseEntity<Product> getProductByName(@PathVariable String name) {
        return ResponseEntity.ok().body(productService.findByName(name));
    }

    @GetMapping("/product_id/{idProduct}")
    public ResponseEntity<Product> getById(@PathVariable Integer idProduct) {
        return ResponseEntity.ok().body(productService.findById(idProduct));
    }
    
    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }
    
    @PutMapping
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return ResponseEntity.ok(productService.update(product));
    }
    
    @DeleteMapping("/{idProduct}")
    public void deleteById(@PathVariable Integer idProduct) {
        productService.deleteById(idProduct);
    }
    
}