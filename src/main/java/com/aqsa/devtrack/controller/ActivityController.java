package com.aqsa.devtrack.controller;

import com.aqsa.devtrack.entity.Activity;
import com.aqsa.devtrack.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    // CREATE Activity
    @PostMapping
    public Activity createActivity(@RequestBody Activity activity) {
        return activityService.createActivity(activity);
    }

    // GET all Activities
    @GetMapping
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }

    // GET Activity by ID
    @GetMapping("/{id}")
    public Optional<Activity> getActivityById(@PathVariable Long id) {
        return activityService.getActivityById(id);
    }

    // DELETE Activity
    @DeleteMapping("/{id}")
    public void deleteActivity(@PathVariable Long id) {
        activityService.deleteActivity(id);
    }
}