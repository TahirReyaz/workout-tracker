package com.example.workout_tracker.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "sets")
public class SetEntity {
    private String type;
    private Integer depth;
    private Float weight;
    private Integer seconds;
    private Integer reps;
    private String userId;
    private String createdAt;
    @Id
    private String _id;
}