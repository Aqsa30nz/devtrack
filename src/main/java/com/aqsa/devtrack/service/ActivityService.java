package com.aqsa.devtrack.service;

import com.aqsa.devtrack.entity.Activity;
import com.aqsa.devtrack.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    // CREATE
    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    // READ ALL
    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    // READ BY ID
    public Optional<Activity> getActivityById(Long id) {
        return activityRepository.findById(id);
    }

    // DELETE
    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }

    //UPDATE
    public Activity updateActivity(Long id, Activity updatedActivity) {
        Activity existingActivity = activityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Activity not found with id: " + id));

        existingActivity.setTitle(updatedActivity.getTitle());
        existingActivity.setDescription(updatedActivity.getDescription());
        existingActivity.setDurationMinutes(updatedActivity.getDurationMinutes());

        return activityRepository.save(existingActivity);
    }
}