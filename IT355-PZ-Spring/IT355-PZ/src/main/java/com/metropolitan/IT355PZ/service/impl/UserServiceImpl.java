package com.metropolitan.IT355PZ.service.impl;

import com.metropolitan.IT355PZ.entity.User;
import com.metropolitan.IT355PZ.repository.UserRepository;
import com.metropolitan.IT355PZ.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository; 

    @Override
    public List<User> findAll() {
        log.info("Showing all users from database");
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer idUser) {
        log.info("Finding user by ID: {} from database", idUser);
        return userRepository.findByIdUser(idUser);
    }
    
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        log.info("Creating new user {} with ID: {}", user.getFirstName(), user.getIdUser());
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        log.info("Updating user {} with ID: {}", user.getFirstName(), user.getIdUser());
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Integer idUser) {
        log.info("Deleting user with ID: {}", idUser);
        userRepository.deleteById(idUser);
    }

}