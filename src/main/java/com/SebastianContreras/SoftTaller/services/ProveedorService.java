package com.SebastianContreras.SoftTaller.services;

import com.SebastianContreras.SoftTaller.entities.Proveedor;
import com.SebastianContreras.SoftTaller.persistence.ProveedorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProveedorService {
    @Autowired
    private ProveedorDao proveedorDao;

    public List<Proveedor> findAll() {
        return proveedorDao.findAll();
    }
    public Page<Proveedor> findAllPage(Pageable pageable) {
        return proveedorDao.findAllPage(pageable);
    }

    public Optional<Proveedor> findById(Integer id) {
        return proveedorDao.findById(id);
    }


    public Proveedor save(Proveedor proveedor) {
        return proveedorDao.save(proveedor);
    }


    public void deleteById(Integer id) {
        proveedorDao.deleteById(id);
    }

}
