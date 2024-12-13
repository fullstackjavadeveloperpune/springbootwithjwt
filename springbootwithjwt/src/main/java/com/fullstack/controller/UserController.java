package com.fullstack.controller;

import com.fullstack.config.JWTUtil;
import com.fullstack.model.User;
import com.fullstack.service.UserInfoDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/auth")
public class UserController {

    @Autowired
    private UserInfoDetailServiceImpl userInfoDetailService;

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody User user) {
        return ResponseEntity.ok(userInfoDetailService.signUp(user));
    }

    @PostMapping("/signin")
    public ResponseEntity<String> generateToken(@RequestBody User user) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getUserPassword()));

        return ResponseEntity.ok(jwtUtil.generateToken(user.getUserName()));
    }
}
