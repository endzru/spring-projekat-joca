package com.metropolitan.IT355PZ.service.impl;

import com.metropolitan.IT355PZ.entity.Cart;
import com.metropolitan.IT355PZ.repository.CartRepository;
import com.metropolitan.IT355PZ.service.CartService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CartServiceImpl implements CartService {
    
    private final CartRepository cartRepository;

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart findById(Integer idCart) {
        return cartRepository.findByIdCart(idCart);
    }

    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart update(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void deleteById(Integer idCart) {
        cartRepository.deleteById(idCart);
    }
    
}