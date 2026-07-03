package com.aqsa.devtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RegisterResponseDTO {

    private Long id;
    private String name;
    private String email;
    private String role;
}