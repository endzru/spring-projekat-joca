package com.metropolitan.IT355PZ.repository;

import com.metropolitan.IT355PZ.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
    Restaurant findByName(String name);
    Restaurant findByIdRestaurant(Integer idRestaurant);
}