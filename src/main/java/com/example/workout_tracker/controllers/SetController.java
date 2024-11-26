package com.example.workout_tracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.workout_tracker.domain.Set;
import com.example.workout_tracker.services.SetService;

@Controller
public class SetController {
    private final SetService setService;
    
    @Autowired
    public SetController(final SetService setService) {
        this.setService = setService;
    }

    @PutMapping(path = "/sets/{userId}")
    public ResponseEntity<Set> createSet(
        @PathVariable final String userId, 
        @RequestBody final Set set
    ) {
        set.setUserId(userId);
        final Set savedSet = setService.create(set);
        final ResponseEntity<Set> responseEntity = new ResponseEntity<Set>(savedSet, HttpStatus.CREATED);
        return responseEntity;
    }
}
