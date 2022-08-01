package com.metropolitan.IT355PZ.controller;

import com.metropolitan.IT355PZ.entity.User;
import com.metropolitan.IT355PZ.service.UserService;
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
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    
    private final UserService userService;
    
    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(userService.findAll()); // get user list
    }
    
    @GetMapping("/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        return ResponseEntity.ok().body(userService.findByUsername(username));
    }

    @GetMapping("/user_id/{idUser}")
    public ResponseEntity<User> getById(@PathVariable Integer idUser) {
        return ResponseEntity.ok().body(userService.findById(idUser));
    }
    
    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }
    
    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user) {
        return ResponseEntity.ok(userService.update(user));
    }
    
    @DeleteMapping("/{idUser}")
    public void deleteById(@PathVariable Integer idUser) {
        userService.deleteById(idUser);
    }
    
}