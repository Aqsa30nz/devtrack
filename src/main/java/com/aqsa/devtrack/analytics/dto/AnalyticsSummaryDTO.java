package com.aqsa.devtrack.analytics.dto;

import lombok.Data;

@Data
public class AnalyticsSummaryDTO {

    private long totalActivities;

    private long totalMinutes;

    private double averageSession;

    private int longestSession;

    private int shortestSession;
}