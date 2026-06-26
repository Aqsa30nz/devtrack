package com.aqsa.devtrack.analytics;

import com.aqsa.devtrack.analytics.dto.AnalyticsSummaryDTO;
import com.aqsa.devtrack.dto.ApiResponse;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.aqsa.devtrack.analytics.dto.WeeklyAnalyticsDTO;


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
}