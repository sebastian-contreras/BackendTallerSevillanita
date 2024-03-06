package com.SebastianContreras.SoftTaller.persistence;

import com.SebastianContreras.SoftTaller.entities.Repuesto;
import com.SebastianContreras.SoftTaller.repositories.RepuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RepuestoDao {
    @Autowired
    RepuestoRepository repository;

    public List<Repuesto> findAll() {
        return repository.findAll();
    }

    public Page<Repuesto> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }


    public Optional<Repuesto> findById(String id) {
        return repository.findById(id);
    }

    public Repuesto save(Repuesto repuesto) {
        return repository.saveAndFlush(repuesto);
    }

    public Repuesto update(Repuesto repuesto) {
        return repository.save(repuesto);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
