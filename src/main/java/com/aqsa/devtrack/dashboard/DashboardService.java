package com.aqsa.devtrack.dashboard;

import com.aqsa.devtrack.analytics.AnalyticsService;
import com.aqsa.devtrack.dashboard.dto.DashboardResponseDTO;
import com.aqsa.devtrack.dto.ActivityResponseDTO;
import com.aqsa.devtrack.dto.PaginatedActivityResponseDTO;
import com.aqsa.devtrack.dto.ActivityFilterDTO;
import com.aqsa.devtrack.service.ActivityService;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    private final AnalyticsService analyticsService;
    private final ActivityService activityService;

    public DashboardService(
            AnalyticsService analyticsService,
            ActivityService activityService
    ) {
        this.analyticsService = analyticsService;
        this.activityService = activityService;
    }

    public DashboardResponseDTO getDashboard() {

        DashboardResponseDTO dashboard = new DashboardResponseDTO();

        dashboard.setSummary(
                analyticsService.getSummary()
        );

        dashboard.setStreak(
                analyticsService.getStreak()
        );

        PaginatedActivityResponseDTO recent =
                activityService.getAllActivities(
                        new ActivityFilterDTO(),
                        0,
                        5,
                        "createdAt",
                        "desc"
                );

        dashboard.setRecentActivities(
                recent.getActivities()
        );

        return dashboard;
    }
}