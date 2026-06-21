package com.aqsa.devtrack.controller;

import jakarta.validation.Valid;

import com.aqsa.devtrack.dto.ActivityRequestDTO;
import com.aqsa.devtrack.dto.ActivityResponseDTO;
import com.aqsa.devtrack.dto.ApiResponse;
import com.aqsa.devtrack.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        ActivityResponseDTO activity =
                activityService.createActivity(requestDTO);

        return new ApiResponse<>(
                true,
                activity,
                "Activity created successfully"
        );
    }

    @GetMapping
    public ApiResponse<List<ActivityResponseDTO>> getAllActivities() {

        return new ApiResponse<>(
                true,
                activityService.getAllActivities(),
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