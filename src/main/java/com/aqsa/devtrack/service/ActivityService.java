package com.aqsa.devtrack.service;

import com.aqsa.devtrack.dto.ActivityRequestDTO;
import com.aqsa.devtrack.dto.ActivityResponseDTO;
import com.aqsa.devtrack.entity.Activity;
import com.aqsa.devtrack.entity.User;
import com.aqsa.devtrack.exception.ResourceNotFoundException;
import com.aqsa.devtrack.exception.UnauthorizedAccessException;
import com.aqsa.devtrack.repository.ActivityRepository;
import com.aqsa.devtrack.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;
    private final UserRepository userRepository;

    public ActivityService(
            ActivityRepository activityRepository,
            UserRepository userRepository
    ) {
        this.activityRepository = activityRepository;
        this.userRepository = userRepository;
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

    private User getCurrentUser() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String email = authentication.getName();

        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Authenticated user not found"
                        ));
    }

    public ActivityResponseDTO createActivity(
            ActivityRequestDTO requestDTO
    ) {

        User currentUser = getCurrentUser();

        Activity activity = new Activity();

        activity.setTitle(requestDTO.getTitle());
        activity.setDescription(requestDTO.getDescription());
        activity.setDurationMinutes(requestDTO.getDurationMinutes());

        activity.setUser(currentUser);

        Activity savedActivity =
                activityRepository.save(activity);

        return mapToResponseDTO(savedActivity);
    }

    public List<ActivityResponseDTO> getAllActivities() {

        User currentUser = getCurrentUser();

        return activityRepository.findByUser(currentUser)
                .stream()
                .map(this::mapToResponseDTO)
                .toList();
    }

    public ActivityResponseDTO getActivityById(Long id) {

        User currentUser = getCurrentUser();

        Activity activity = activityRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Activity not found with id: " + id
                        ));

        if (!activity.getUser().getId().equals(currentUser.getId())) {
            throw new UnauthorizedAccessException(
                    "You cannot access this activity"
            );
        }

        return mapToResponseDTO(activity);
    }

    public ActivityResponseDTO updateActivity(
            Long id,
            ActivityRequestDTO requestDTO
    ) {

        User currentUser = getCurrentUser();

        Activity activity = activityRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Activity not found with id: " + id
                        ));

        if (!activity.getUser().getId().equals(currentUser.getId())) {
            throw new UnauthorizedAccessException(
                    "You cannot update this activity"
            );
        }

        activity.setTitle(requestDTO.getTitle());
        activity.setDescription(requestDTO.getDescription());
        activity.setDurationMinutes(requestDTO.getDurationMinutes());

        Activity updatedActivity =
                activityRepository.save(activity);

        return mapToResponseDTO(updatedActivity);
    }

    public void deleteActivity(Long id) {

        User currentUser = getCurrentUser();

        Activity activity = activityRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Activity not found with id: " + id
                        ));

        if (!activity.getUser().getId().equals(currentUser.getId())) {
            throw new UnauthorizedAccessException(
                    "You cannot delete this activity"
            );
        }

        activityRepository.delete(activity);
    }
}