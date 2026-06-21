package com.aqsa.devtrack.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ActivityResponseDTO {

    private Long id;
    private String title;
    private String description;
    private Integer durationMinutes;
    private LocalDateTime createdAt;
}