package com.aqsa.devtrack.analytics.dto;

import lombok.Data;

@Data
public class MonthlyAnalyticsDTO {

    private String monthLabel;   // e.g. 2026-06

    private long totalActivities;

    private long totalMinutes;
}