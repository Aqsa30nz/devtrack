package com.aqsa.devtrack.repository;

import com.aqsa.devtrack.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ActivityRepository extends
        JpaRepository<Activity, Long>,
        JpaSpecificationExecutor<Activity> {

    @Query("SELECT SUM(a.durationMinutes) FROM Activity a WHERE a.user.id = :userId")
    Long getTotalMinutes(@Param("userId") Long userId);
}