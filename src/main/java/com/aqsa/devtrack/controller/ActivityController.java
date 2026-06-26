package com.aqsa.devtrack.controller;

import jakarta.validation.Valid;

import com.aqsa.devtrack.dto.ActivityRequestDTO;
import com.aqsa.devtrack.dto.ActivityResponseDTO;
import com.aqsa.devtrack.dto.ApiResponse;
import com.aqsa.devtrack.dto.PaginatedActivityResponseDTO;
import com.aqsa.devtrack.dto.ActivityFilterDTO;
import com.aqsa.devtrack.service.ActivityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping
    public ApiResponse<ActivityResponseDTO> createActivity(
            @Valid @RequestBody ActivityRequestDTO requestDTO) {

        return new ApiResponse<>(
                true,
                activityService.createActivity(requestDTO),
                "Activity created successfully"
        );
    }

    @GetMapping
    public ApiResponse<PaginatedActivityResponseDTO> getAllActivities(

            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "createdAt") String sort,
            @RequestParam(defaultValue = "desc") String direction,

            @RequestParam(required = false) Integer minDuration,
            @RequestParam(required = false) Integer maxDuration,

            @RequestParam(required = false) String keyword
    ) {

        ActivityFilterDTO filter = new ActivityFilterDTO();
        filter.setMinDuration(minDuration);
        filter.setMaxDuration(maxDuration);
        filter.setKeyword(keyword);

        return new ApiResponse<>(
                true,
                activityService.getAllActivities(
                        filter,
                        page,
                        size,
                        sort,
                        direction
                ),
                "Activities fetched successfully"
        );
    }

    @GetMapping("/{id}")
    public ApiResponse<ActivityResponseDTO> getActivityById(
            @PathVariable Long id) {

        return new ApiResponse<>(
                true,
                activityService.getActivityById(id),
                "Activity fetched successfully"
        );
    }

    @PutMapping("/{id}")
    public ApiResponse<ActivityResponseDTO> updateActivity(
            @PathVariable Long id,
            @Valid @RequestBody ActivityRequestDTO requestDTO) {

        return new ApiResponse<>(
                true,
                activityService.updateActivity(id, requestDTO),
                "Activity updated successfully"
        );
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteActivity(
            @PathVariable Long id) {

        activityService.deleteActivity(id);

        return new ApiResponse<>(
                true,
                null,
                "Activity deleted successfully"
        );
    }
}