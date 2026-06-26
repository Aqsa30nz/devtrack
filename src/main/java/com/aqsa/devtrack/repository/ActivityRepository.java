package com.aqsa.devtrack.repository;

import com.aqsa.devtrack.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface ActivityRepository extends
        JpaRepository<Activity, Long>,
        JpaSpecificationExecutor<Activity> {

    @Query("""
    SELECT COALESCE(SUM(a.durationMinutes), 0)
    FROM Activity a
    WHERE a.user.id = :userId
""")
    Long getTotalMinutes(@Param("userId") Long userId);
    @Query("""
    SELECT
        FUNCTION('to_char', a.createdAt, 'YYYY-"W"IW') as week,
        COUNT(a),
        COALESCE(SUM(a.durationMinutes), 0)
    FROM Activity a
    WHERE a.user.id = :userId
    GROUP BY FUNCTION('to_char', a.createdAt, 'YYYY-"W"IW')
    ORDER BY week DESC
""")
    List<Object[]> getWeeklyAnalytics(@Param("userId") Long userId);

    @Query("""
    SELECT
        FUNCTION('to_char', a.createdAt, 'YYYY-MM') as month,
        COUNT(a),
        COALESCE(SUM(a.durationMinutes), 0)
    FROM Activity a
    WHERE a.user.id = :userId
    GROUP BY FUNCTION('to_char', a.createdAt, 'YYYY-MM')
    ORDER BY month DESC
""")
    List<Object[]> getMonthlyAnalytics(@Param("userId") Long userId);

}


