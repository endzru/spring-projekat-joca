package com.metropolitan.IT355PZ.repository;

import com.metropolitan.IT355PZ.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    Cart findByIdCart(Integer idCart);
}