package com.metropolitan.IT355PZ.repository;

import com.metropolitan.IT355PZ.entity.OrderPlaced;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPlacedRepository extends JpaRepository<OrderPlaced, Integer> {
    OrderPlaced findByIdOrderPlaced(Integer idOrderPlaced);
}