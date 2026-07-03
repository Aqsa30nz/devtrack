package com.aqsa.devtrack.controller;

import com.aqsa.devtrack.dto.LoginRequestDTO;
import com.aqsa.devtrack.dto.RegisterRequestDTO;
import com.aqsa.devtrack.dto.AuthResponseDTO;
import com.aqsa.devtrack.service.AuthService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.aqsa.devtrack.dto.RegisterResponseDTO;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public RegisterResponseDTO register(
            @Valid @RequestBody RegisterRequestDTO requestDTO) {
        return authService.register(requestDTO);
    }

    @PostMapping("/login")
    public AuthResponseDTO login(@Valid @RequestBody LoginRequestDTO requestDTO) {
        return authService.login(requestDTO);
    }
}