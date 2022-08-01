package com.metropolitan.IT355PZ.service;

import com.metropolitan.IT355PZ.entity.Cart;
import java.util.List;

public interface CartService {
    List<Cart> findAll();
    Cart findById(Integer idCart);
    Cart save(Cart cart);
    Cart update(Cart cart);
    void deleteById(Integer idCart);
}