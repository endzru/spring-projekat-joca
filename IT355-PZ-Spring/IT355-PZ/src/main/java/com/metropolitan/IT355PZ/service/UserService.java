package com.metropolitan.IT355PZ.service;

import com.metropolitan.IT355PZ.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Integer idUser);
    User findByUsername(String username);
    User save(User user);
    User update(User user);
    void deleteById(Integer idUser);
}