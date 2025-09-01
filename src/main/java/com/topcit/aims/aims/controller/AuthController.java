package com.topcit.aims.aims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.topcit.aims.aims.dto.request.LoginRequest;
import com.topcit.aims.aims.dto.response.LoginResponse;
import com.topcit.aims.aims.service.AuthService;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    /*@PostMapping("/login")
    public boolean login(@RequestBody LoginRequest request) {
        return authService.login(request.getEmail(), request.getPassword());
    }*/

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest.getEmail(), loginRequest.getPassword())
                .map(token -> ResponseEntity.ok(new LoginResponse(token)))
                .orElseGet(() -> ResponseEntity.status(401).body(new LoginResponse("Invalid credentials")));
    }
}
