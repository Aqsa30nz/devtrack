package com.aqsa.devtrack.specification;

import com.aqsa.devtrack.dto.ActivityFilterDTO;
import com.aqsa.devtrack.entity.Activity;
import com.aqsa.devtrack.entity.User;
import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class ActivitySpecification {

    private ActivitySpecification() {
    }

    public static Specification<Activity> withFilters(
            ActivityFilterDTO filter,
            User currentUser
    ) {

        return (root, query, cb) -> {

            List<Predicate> predicates = new ArrayList<>();

            // Security constraint (always applied)
            predicates.add(
                    cb.equal(root.get("user"), currentUser)
            );

            // Duration filters
            if (filter != null) {

                if (filter.getMinDuration() != null) {
                    predicates.add(
                            cb.greaterThanOrEqualTo(
                                    root.get("durationMinutes"),
                                    filter.getMinDuration()
                            )
                    );
                }

                if (filter != null) {

                    // existing duration filters already here

                    if (filter.getStartDate() != null) {
                        predicates.add(
                                cb.greaterThanOrEqualTo(
                                        root.get("createdAt"),
                                        filter.getStartDate()
                                )
                        );
                    }

                    if (filter.getEndDate() != null) {
                        predicates.add(
                                cb.lessThanOrEqualTo(
                                        root.get("createdAt"),
                                        filter.getEndDate()
                                )
                        );
                    }
                }
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}