package com.aqsa.devtrack.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ActivityFilterDTO {

    private Integer minDuration;
    private Integer maxDuration;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private String keyword;
}