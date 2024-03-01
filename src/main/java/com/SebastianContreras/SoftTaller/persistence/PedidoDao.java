package com.SebastianContreras.SoftTaller.persistence;


import com.SebastianContreras.SoftTaller.entities.Pedido;
import com.SebastianContreras.SoftTaller.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Optional<Pedido> findById(Integer id) {
        return repository.findById(id);
    }

    public void save(Pedido pedido) {
        repository.save(pedido);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
