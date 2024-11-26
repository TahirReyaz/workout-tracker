package com.example.workout_tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.workout_tracker.domain.SetEntity;

@Repository
public interface SetRepository extends JpaRepository<SetEntity, String> {
    
}
