package com.aqsa.devtrack.analytics.dto;

import lombok.Data;

@Data
public class WeeklyAnalyticsDTO {

    private String weekLabel;   // e.g. 2026-W25

    private long totalActivities;

    private long totalMinutes;
}