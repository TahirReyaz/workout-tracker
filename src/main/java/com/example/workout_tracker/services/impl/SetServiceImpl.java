package com.example.workout_tracker.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workout_tracker.domain.Set;
import com.example.workout_tracker.domain.SetEntity;
import com.example.workout_tracker.repositories.SetRepository;
import com.example.workout_tracker.services.SetService;

@Service
public class SetServiceImpl implements SetService {

    private final SetRepository setRepo;

    @Autowired
    public SetServiceImpl(final SetRepository setRepo) {
        this.setRepo = setRepo;
    }

    @Override
    public Set create(final Set set) {
        final SetEntity setEntity = setToSetEntity(set);
        final SetEntity savedSetEntity = setRepo.save(setEntity);
        return setEntityToSet(savedSetEntity);
    }

    private SetEntity setToSetEntity(Set set) {
        return SetEntity.builder()._id(set.get_id()).createdAt(set.getCreatedAt()).depth(set.getDepth()).type(set.getType()).weight(set.getWeight()).seconds(set.getSeconds()).reps(set.getReps()).userId(set.getUserId()).build();
    }

    private Set setEntityToSet(SetEntity setEntity) {
        return Set.builder()._id(setEntity.get_id()).createdAt(setEntity.getCreatedAt()).depth(setEntity.getDepth()).type(setEntity.getType()).weight(setEntity.getWeight()).seconds(setEntity.getSeconds()).reps(setEntity.getReps()).userId(setEntity.getUserId()).build();
    }
    
}
