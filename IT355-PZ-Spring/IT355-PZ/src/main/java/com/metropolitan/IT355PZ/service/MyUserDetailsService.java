package com.metropolitan.IT355PZ.service;

import com.metropolitan.IT355PZ.repository.UserRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.metropolitan.IT355PZ.entity.User user = userRepository.findByUsername(username);
        return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }

}