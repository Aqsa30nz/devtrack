package com.aqsa.devtrack.controller;

import com.aqsa.devtrack.dto.RegisterRequestDTO;
import com.aqsa.devtrack.entity.User;
import com.aqsa.devtrack.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public User register(
            @RequestBody RegisterRequestDTO requestDTO) {

        return authService.register(requestDTO);
    }
}