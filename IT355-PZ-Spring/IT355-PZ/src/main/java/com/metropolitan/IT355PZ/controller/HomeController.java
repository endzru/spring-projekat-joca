package com.metropolitan.IT355PZ.controller;

import com.metropolitan.IT355PZ.entity.AuthRequest;
import com.metropolitan.IT355PZ.security.jwtutil.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
    
    @Autowired
    private JwtUtil jwtUtil;
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @GetMapping("/")
    public String welcome() {
        return "Welcome to secretcode !!";
    }
    
    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest auth) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(auth.getUsername(), auth.getPassword())
            );
        } catch (BadCredentialsException ex) {
            throw new Exception("Error: Invalid username/password", ex);
        }
        return jwtUtil.generateToken(auth.getUsername());
    }
    
}