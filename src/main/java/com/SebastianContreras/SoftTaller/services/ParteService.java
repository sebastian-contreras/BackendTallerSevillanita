package com.SebastianContreras.SoftTaller.services;

import com.SebastianContreras.SoftTaller.entities.Parte;
import com.SebastianContreras.SoftTaller.persistence.ParteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParteService {
    @Autowired
    private ParteDao parteDao;

    public List<Parte> findAll() {
        return parteDao.findAll();
    }

    public Page<Parte> findAllPage(Pageable pageable) {
        return parteDao.findAllPage(pageable);
    }

    public Optional<Parte> findById(String id) {
        return parteDao.findById(id);
    }


    public Parte save(Parte parte) {
        return parteDao.save(parte);
    }

    public Parte update(Parte parte) {
        return parteDao.update(parte);
    }


    public void deleteById(String id) {
        parteDao.deleteById(id);
    }
}
