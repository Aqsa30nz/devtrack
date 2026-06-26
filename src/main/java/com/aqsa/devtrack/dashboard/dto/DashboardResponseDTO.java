package com.aqsa.devtrack.dashboard.dto;

import com.aqsa.devtrack.analytics.dto.AnalyticsSummaryDTO;
import com.aqsa.devtrack.analytics.dto.LearningStreakDTO;
import com.aqsa.devtrack.dto.ActivityResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class DashboardResponseDTO {

    private AnalyticsSummaryDTO summary;

    private LearningStreakDTO streak;

    private List<ActivityResponseDTO> recentActivities;
}