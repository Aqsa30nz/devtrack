package com.aqsa.devtrack.repository;

import com.aqsa.devtrack.entity.Activity;
import com.aqsa.devtrack.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    List<Activity> findByUser(User user);
}