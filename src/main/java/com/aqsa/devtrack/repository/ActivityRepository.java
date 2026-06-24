package com.aqsa.devtrack.repository;

import com.aqsa.devtrack.entity.Activity;
import com.aqsa.devtrack.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    Page<Activity> findByUser(User user, Pageable pageable);
}