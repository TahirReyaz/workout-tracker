package com.example.workout_tracker.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Set {
    private String type;
    private Integer depth;
    private Float weight;
    private Integer seconds;
    private Integer reps;
    private String userId;
    private String createdAt;
    private String _id;
}
