package com.example.continuoudeploymentandintegration.service;

import com.example.continuoudeploymentandintegration.model.Dog;
import com.example.continuoudeploymentandintegration.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class DogService implements IDog{

    private DogRepository repo;
    public DogService(DogRepository repo){
        this.repo = repo;
    }

    @Override
    public <S extends Dog> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends Dog> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Dog> findById(Long aLong) {
        return repo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Set<Dog> findAll() {
        Set<Dog> set = new HashSet<>();
        repo.findAll().forEach(set::add); // dobbelt :: betyder at du giver metoden med som parameter
        return set;
    }

    @Override
    public Iterable<Dog> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Dog entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Dog> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
