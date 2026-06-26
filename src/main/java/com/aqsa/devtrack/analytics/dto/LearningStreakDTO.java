package com.aqsa.devtrack.analytics.dto;

import lombok.Data;

@Data
public class LearningStreakDTO {

    private int currentStreak;

    private int longestStreak;

    private int totalActiveDays;
}