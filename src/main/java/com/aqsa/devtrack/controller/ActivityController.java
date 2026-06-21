package com.aqsa.devtrack.controller;
import jakarta.validation.Valid;

import com.aqsa.devtrack.dto.ActivityRequestDTO;
import com.aqsa.devtrack.dto.ActivityResponseDTO;
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
    public ActivityResponseDTO createActivity(
            @Valid @RequestBody ActivityRequestDTO requestDTO) {

        return activityService.createActivity(requestDTO);
    }

    @GetMapping
    public List<ActivityResponseDTO> getAllActivities() {
        return activityService.getAllActivities();
    }

    @GetMapping("/{id}")
    public ActivityResponseDTO getActivityById(
            @PathVariable Long id) {

        return activityService.getActivityById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteActivity(
            @PathVariable Long id) {

        activityService.deleteActivity(id);
    }

    @PutMapping("/{id}")
    public ActivityResponseDTO updateActivity(
            @PathVariable Long id,
            @RequestBody ActivityRequestDTO requestDTO) {

        return activityService.updateActivity(id, requestDTO);
    }
}