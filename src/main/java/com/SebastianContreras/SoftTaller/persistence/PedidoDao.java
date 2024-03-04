package com.SebastianContreras.SoftTaller.persistence;


import com.SebastianContreras.SoftTaller.entities.Pedido;
import com.SebastianContreras.SoftTaller.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PedidoDao {
    @Autowired
    PedidoRepository repository;

    public List<Pedido> findAll() {
        return (List<Pedido>) repository.findAll();
    }
    public Page<Pedido> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }


    public Optional<Pedido> findById(Integer id) {
        return repository.findById(id);
    }

    public Pedido save(Pedido pedido) {
        return repository.save(pedido);
    }
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
