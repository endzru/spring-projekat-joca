package com.metropolitan.IT355PZ.service;

import com.metropolitan.IT355PZ.entity.OrderPlaced;
import java.util.List;

public interface OrderPlacedService {
    List<OrderPlaced> findAll();
    OrderPlaced findById(Integer idOrderPlaced);
    OrderPlaced save(OrderPlaced orderPlaced);
    OrderPlaced update(OrderPlaced orderPlaced);
    void deleteById(Integer idOrderPlaced);
}