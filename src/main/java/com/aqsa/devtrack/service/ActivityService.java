package com.aqsa.devtrack.service;

import com.aqsa.devtrack.dto.ActivityRequestDTO;
import com.aqsa.devtrack.dto.ActivityResponseDTO;
import com.aqsa.devtrack.entity.Activity;
import com.aqsa.devtrack.exception.ResourceNotFoundException;
import com.aqsa.devtrack.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    private ActivityResponseDTO mapToResponseDTO(Activity activity) {
        ActivityResponseDTO dto = new ActivityResponseDTO();

        dto.setId(activity.getId());
        dto.setTitle(activity.getTitle());
        dto.setDescription(activity.getDescription());
        dto.setDurationMinutes(activity.getDurationMinutes());
        dto.setCreatedAt(activity.getCreatedAt());

        return dto;
    }

    public ActivityResponseDTO createActivity(ActivityRequestDTO requestDTO) {

        Activity activity = new Activity();

        activity.setTitle(requestDTO.getTitle());
        activity.setDescription(requestDTO.getDescription());
        activity.setDurationMinutes(requestDTO.getDurationMinutes());

        Activity savedActivity = activityRepository.save(activity);

        return mapToResponseDTO(savedActivity);
    }

    public List<ActivityResponseDTO> getAllActivities() {

        return activityRepository.findAll()
                .stream()
                .map(this::mapToResponseDTO)
                .toList();
    }

    public ActivityResponseDTO getActivityById(Long id) {

        Activity activity = activityRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Activity not found with id: " + id
                        ));

        return mapToResponseDTO(activity);
    }

    public void deleteActivity(Long id) {

        Activity activity = activityRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Activity not found with id: " + id
                        ));

        activityRepository.delete(activity);
    }

    public ActivityResponseDTO updateActivity(
            Long id,
            ActivityRequestDTO requestDTO) {

        Activity existingActivity = activityRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Activity not found with id: " + id
                        ));

        existingActivity.setTitle(requestDTO.getTitle());
        existingActivity.setDescription(requestDTO.getDescription());
        existingActivity.setDurationMinutes(requestDTO.getDurationMinutes());

        Activity updatedActivity = activityRepository.save(existingActivity);

        return mapToResponseDTO(updatedActivity);
    }
}