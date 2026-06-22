package com.aqsa.devtrack.service;

import com.aqsa.devtrack.dto.RegisterRequestDTO;
import com.aqsa.devtrack.entity.User;
import com.aqsa.devtrack.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(RegisterRequestDTO requestDTO) {

        if (userRepository.existsByEmail(requestDTO.getEmail())) {
            throw new IllegalArgumentException(
                    "Email already registered"
            );
        }

        User user = new User();

        user.setName(requestDTO.getName());
        user.setEmail(requestDTO.getEmail());
        user.setPassword(requestDTO.getPassword());

        user.setRole("USER");

        return userRepository.save(user);
    }
}