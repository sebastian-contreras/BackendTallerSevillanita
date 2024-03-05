package com.SebastianContreras.SoftTaller.services;

import com.SebastianContreras.SoftTaller.entities.Conjunto;
import com.SebastianContreras.SoftTaller.persistence.ConjuntoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ConjuntoService {
    @Autowired
    private ConjuntoDao conjuntoDao;

    public List<Conjunto> findAll() {
        return conjuntoDao.findAll();
    }
    public Page<Conjunto> findAllPage(Pageable pageable) {
        return conjuntoDao.findAllPage(pageable);
    }

    public Optional<Conjunto> findById(String id) {
        return conjuntoDao.findById(id);
    }


    public Conjunto save(Conjunto conjunto) {
        return conjuntoDao.save(conjunto);
    }
    public Conjunto update(Conjunto conjunto) {
        return conjuntoDao.update(conjunto);
    }


    public void deleteById(String id) {
        conjuntoDao.deleteById(id);
    }

}
