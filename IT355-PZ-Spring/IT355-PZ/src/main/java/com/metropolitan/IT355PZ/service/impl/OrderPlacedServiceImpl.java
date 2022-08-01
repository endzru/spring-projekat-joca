package com.metropolitan.IT355PZ.service.impl;

import com.metropolitan.IT355PZ.entity.OrderPlaced;
import com.metropolitan.IT355PZ.repository.OrderPlacedRepository;
import com.metropolitan.IT355PZ.service.OrderPlacedService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class OrderPlacedServiceImpl implements OrderPlacedService {
    
    private final OrderPlacedRepository orderPlacedRepository;

    @Override
    public List<OrderPlaced> findAll() {
        return orderPlacedRepository.findAll();
    }

    @Override
    public OrderPlaced findById(Integer idOrderPlaced) {
        return orderPlacedRepository.findByIdOrderPlaced(idOrderPlaced);
    }

    @Override
    public OrderPlaced save(OrderPlaced orderPlaced) {
        return orderPlacedRepository.save(orderPlaced);
    }

    @Override
    public OrderPlaced update(OrderPlaced orderPlaced) {
        return orderPlacedRepository.save(orderPlaced);
    }

    @Override
    public void deleteById(Integer idOrderPlaced) {
        orderPlacedRepository.deleteById(idOrderPlaced);
    }
    
}