package com.metropolitan.IT355PZ.repository;

import com.metropolitan.IT355PZ.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findByIdUser(Integer idUser);
}