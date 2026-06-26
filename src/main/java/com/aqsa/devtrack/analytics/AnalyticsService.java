package com.aqsa.devtrack.analytics;

import com.aqsa.devtrack.analytics.dto.AnalyticsSummaryDTO;
import com.aqsa.devtrack.entity.User;
import com.aqsa.devtrack.repository.ActivityRepository;
import com.aqsa.devtrack.repository.UserRepository;
import com.aqsa.devtrack.exception.ResourceNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    private final ActivityRepository activityRepository;
    private final UserRepository userRepository;

    public AnalyticsService(ActivityRepository activityRepository,
                            UserRepository userRepository) {
        this.activityRepository = activityRepository;
        this.userRepository = userRepository;
    }

    private User getCurrentUser() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String email = authentication.getName();

        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));
    }

    public AnalyticsSummaryDTO getSummary() {

        User user = getCurrentUser();

        Long totalMinutes = activityRepository.getTotalMinutes(user.getId());

        AnalyticsSummaryDTO dto = new AnalyticsSummaryDTO();

        dto.setTotalActivities(0); // we will improve next step
        dto.setTotalMinutes(totalMinutes != null ? totalMinutes : 0);
        dto.setAverageSession(0);
        dto.setLongestSession(0);
        dto.setShortestSession(0);

        return dto;
    }
}