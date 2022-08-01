package com.metropolitan.IT355PZ.controller;

import com.metropolitan.IT355PZ.entity.Restaurant;
import com.metropolitan.IT355PZ.service.RestaurantService;
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
@RequestMapping("/restaurants")
@RequiredArgsConstructor
@CrossOrigin
public class RestaurantController {
    
    private final RestaurantService restaurantService;
    
    @GetMapping("")
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        return ResponseEntity.ok().body(restaurantService.findAll()); // get restaurant list
    }
    
    @GetMapping("/{name}")
    public ResponseEntity<Restaurant> getRestaurantByName(@PathVariable String name) {
        return ResponseEntity.ok().body(restaurantService.findByName(name));
    }

    @GetMapping("/restaurant_id/{idRestaurant}")
    public ResponseEntity<Restaurant> getById(@PathVariable Integer idRestaurant) {
        return ResponseEntity.ok().body(restaurantService.findById(idRestaurant));
    }
    
    @PostMapping
    public ResponseEntity<Restaurant> save(@RequestBody Restaurant restaurant) {
        return ResponseEntity.ok(restaurantService.save(restaurant));
    }
    
    @PutMapping
    public ResponseEntity<Restaurant> update(@RequestBody Restaurant restaurant) {
        return ResponseEntity.ok(restaurantService.update(restaurant));
    }
    
    @DeleteMapping("/{idRestaurant}")
    public void deleteById(@PathVariable Integer idRestaurant) {
        restaurantService.deleteById(idRestaurant);
    }
    
}