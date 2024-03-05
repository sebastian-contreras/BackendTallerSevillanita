package com.SebastianContreras.SoftTaller.persistence;

import com.SebastianContreras.SoftTaller.entities.Proveedor;
import com.SebastianContreras.SoftTaller.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProveedorDao {
    @Autowired
    ProveedorRepository repository;

    public List<Proveedor> findAll() {
        return (List<Proveedor>) repository.findAll();
    }
    public Page<Proveedor> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }


    public Optional<Proveedor> findById(Integer id) {
        return repository.findById(id);
    }

    public Proveedor save(Proveedor proveedor) {
        return repository.save(proveedor);
    }
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
