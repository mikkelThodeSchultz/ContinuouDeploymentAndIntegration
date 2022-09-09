package com.example.continuoudeploymentandintegration.repositories;

import com.example.continuoudeploymentandintegration.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
