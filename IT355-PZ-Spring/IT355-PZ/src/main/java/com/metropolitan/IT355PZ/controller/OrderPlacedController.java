package com.metropolitan.IT355PZ.controller;

import com.metropolitan.IT355PZ.entity.OrderPlaced;
import com.metropolitan.IT355PZ.service.OrderPlacedService;
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
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin
public class OrderPlacedController {
    
    private final OrderPlacedService orderPlacedService;
    
    @GetMapping("")
    public ResponseEntity<List<OrderPlaced>> getAllOrders() {
        return ResponseEntity.ok().body(orderPlacedService.findAll()); // get orderPlaced list
    }

    @GetMapping("/orderPlaced_id/{idOrderPlaced}")
    public ResponseEntity<OrderPlaced> getById(@PathVariable Integer idOrderPlaced) {
        return ResponseEntity.ok().body(orderPlacedService.findById(idOrderPlaced));
    }
    
    @PostMapping
    public ResponseEntity<OrderPlaced> save(@RequestBody OrderPlaced orderPlaced) {
        return ResponseEntity.ok(orderPlacedService.save(orderPlaced));
    }
    
    @PutMapping
    public ResponseEntity<OrderPlaced> update(@RequestBody OrderPlaced orderPlaced) {
        return ResponseEntity.ok(orderPlacedService.update(orderPlaced));
    }
    
    @DeleteMapping("/{idOrderPlaced}")
    public void deleteById(@PathVariable Integer idOrderPlaced) {
        orderPlacedService.deleteById(idOrderPlaced);
    }
    
}