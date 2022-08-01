package com.metropolitan.IT355PZ.service.impl;

import com.metropolitan.IT355PZ.entity.Restaurant;
import com.metropolitan.IT355PZ.repository.RestaurantRepository;
import com.metropolitan.IT355PZ.service.RestaurantService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RestaurantServiceImpl implements RestaurantService {
    
    private final RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant findById(Integer idRestaurant) {
        return restaurantRepository.findByIdRestaurant(idRestaurant);
    }
    
    @Override
    public Restaurant findByName(String name) {
        return restaurantRepository.findByName(name);
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant update(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public void deleteById(Integer idRestaurant) {
        restaurantRepository.deleteById(idRestaurant);
    }
    
}