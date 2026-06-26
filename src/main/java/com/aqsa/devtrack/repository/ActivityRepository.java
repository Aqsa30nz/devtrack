package com.aqsa.devtrack.repository;

import com.aqsa.devtrack.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends
        JpaRepository<Activity, Long>,
        JpaSpecificationExecutor<Activity> {
}