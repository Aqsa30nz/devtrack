package com.aqsa.devtrack.dto;

import lombok.Data;

@Data
public class ActivityRequestDTO {

    private String title;
    private String description;
    private Integer durationMinutes;
}