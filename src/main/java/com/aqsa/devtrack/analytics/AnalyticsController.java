package com.aqsa.devtrack.analytics;

import com.aqsa.devtrack.analytics.dto.AnalyticsSummaryDTO;
import com.aqsa.devtrack.dto.ApiResponse;
import org.springframework.web.bind.annotation.*;
import com.aqsa.devtrack.analytics.dto.WeeklyAnalyticsDTO;
import com.aqsa.devtrack.analytics.dto.MonthlyAnalyticsDTO;
import com.aqsa.devtrack.analytics.dto.LearningStreakDTO;
import java.util.List;



@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    private final AnalyticsService analyticsService;

    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @GetMapping("/summary")
    public ApiResponse<AnalyticsSummaryDTO> getSummary() {

        return new ApiResponse<>(
                true,
                analyticsService.getSummary(),
                "Analytics summary fetched successfully"
        );
    }
    @GetMapping("/weekly")
    public ApiResponse<List<WeeklyAnalyticsDTO>> getWeekly() {

        return new ApiResponse<>(
                true,
                analyticsService.getWeeklyAnalytics(),
                "Weekly analytics fetched successfully"
        );
    }

    @GetMapping("/monthly")
    public ApiResponse<List<MonthlyAnalyticsDTO>> getMonthly() {

        return new ApiResponse<>(
                true,
                analyticsService.getMonthlyAnalytics(),
                "Monthly analytics fetched successfully"
        );
    }

    @GetMapping("/streak")
    public ApiResponse<LearningStreakDTO> getStreak() {

        return new ApiResponse<>(
                true,
                analyticsService.getStreak(),
                "Learning streak fetched successfully"
        );
    }

}