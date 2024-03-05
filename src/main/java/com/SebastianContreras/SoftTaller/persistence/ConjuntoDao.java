package com.SebastianContreras.SoftTaller.persistence;

import com.SebastianContreras.SoftTaller.entities.Conjunto;
import com.SebastianContreras.SoftTaller.repositories.ConjuntoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ConjuntoDao {
    @Autowired
    ConjuntoRepository repository;

    public List<Conjunto> findAll() {
        return repository.findAll();
    }

    public Page<Conjunto> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }


    public Optional<Conjunto> findById(String id) {
        return repository.findById(id);
    }

    public Conjunto save(Conjunto conjunto) {

        return repository.saveAndFlush(conjunto);
    }

    public Conjunto update(Conjunto conjunto) {
        return repository.save(conjunto);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
