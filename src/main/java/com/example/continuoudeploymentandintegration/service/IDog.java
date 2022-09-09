package com.example.continuoudeploymentandintegration.service;

import com.example.continuoudeploymentandintegration.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface IDog extends CrudRepository<Dog, Long> {
}
