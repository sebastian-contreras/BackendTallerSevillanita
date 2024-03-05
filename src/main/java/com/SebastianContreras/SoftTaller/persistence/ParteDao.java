package com.SebastianContreras.SoftTaller.persistence;

import com.SebastianContreras.SoftTaller.entities.Parte;
import com.SebastianContreras.SoftTaller.repositories.ParteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ParteDao {
    @Autowired
    ParteRepository repository;

    public List<Parte> findAll() {
        return repository.findAll();
    }

    public Page<Parte> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }


    public Optional<Parte> findById(String id) {
        return repository.findById(id);
    }

    public Parte save(Parte parte) {
        return repository.saveAndFlush(parte);
    }

    public Parte update(Parte parte) {
        return repository.save(parte);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
