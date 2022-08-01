package com.metropolitan.IT355PZ.controller;

import com.metropolitan.IT355PZ.entity.Cart;
import com.metropolitan.IT355PZ.service.CartService;
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
@RequestMapping("/carts")
@RequiredArgsConstructor
@CrossOrigin
public class CartController {
    
    private final CartService cartService;
    
    @GetMapping("")
    public ResponseEntity<List<Cart>> getAllCarts() {
        return ResponseEntity.ok().body(cartService.findAll()); // get cart list
    }

    @GetMapping("/cart_id/{idCart}")
    public ResponseEntity<Cart> getById(@PathVariable Integer idCart) {
        return ResponseEntity.ok().body(cartService.findById(idCart));
    }
    
    @PostMapping
    public ResponseEntity<Cart> save(@RequestBody Cart cart) {
        return ResponseEntity.ok(cartService.save(cart));
    }
    
    @PutMapping
    public ResponseEntity<Cart> update(@RequestBody Cart cart) {
        return ResponseEntity.ok(cartService.update(cart));
    }
    
    @DeleteMapping("/{idCart}")
    public void deleteById(@PathVariable Integer idCart) {
        cartService.deleteById(idCart);
    }
    
}