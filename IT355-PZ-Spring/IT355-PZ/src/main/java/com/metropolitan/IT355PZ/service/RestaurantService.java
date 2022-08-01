package com.metropolitan.IT355PZ.service;

import com.metropolitan.IT355PZ.entity.Restaurant;
import java.util.List;

public interface RestaurantService {
    List<Restaurant> findAll();
    Restaurant findByName(String name);
    Restaurant findById(Integer idRestaurant);
    Restaurant save(Restaurant restaurant);
    Restaurant update(Restaurant restaurant);
    void deleteById(Integer idRestaurant);
}