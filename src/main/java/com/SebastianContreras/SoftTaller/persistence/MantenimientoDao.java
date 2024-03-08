package com.SebastianContreras.SoftTaller.persistence;

import com.SebastianContreras.SoftTaller.entities.Mantenimiento;
import com.SebastianContreras.SoftTaller.repositories.MantenimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MantenimientoDao {
    @Autowired
    MantenimientoRepository repository;

    public List<Mantenimiento> findAll() {
        return repository.findAll();
    }

    public Page<Mantenimiento> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }


    public Optional<Mantenimiento> findById(Integer id) {
        return repository.findById(id);
    }

    public Mantenimiento save(Mantenimiento mantenimiento) {
        return repository.save(mantenimiento);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
