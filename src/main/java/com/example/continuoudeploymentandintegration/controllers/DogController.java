package com.example.continuoudeploymentandintegration.controllers;

import com.example.continuoudeploymentandintegration.model.Dog;
import com.example.continuoudeploymentandintegration.service.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController

public class DogController {

    private DogService dogService;

    public DogController(DogService dogService){
        this.dogService = dogService;
    }



    @GetMapping("/allDogs")
    public ResponseEntity<Set<Dog>> getDogs(){
    return new ResponseEntity<>(dogService.findAll(), HttpStatus.OK);

    }
    @PostMapping("/addDog")
    public ResponseEntity<Dog> addDog(Dog newDog){
        return new ResponseEntity<>(dogService.save(newDog),HttpStatus.OK);
    }

}
