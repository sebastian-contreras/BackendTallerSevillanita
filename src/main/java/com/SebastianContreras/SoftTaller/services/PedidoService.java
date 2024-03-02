package com.SebastianContreras.SoftTaller.services;

import com.SebastianContreras.SoftTaller.entities.Pedido;
import com.SebastianContreras.SoftTaller.persistence.PedidoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoDao pedidoDao;

    public List<Pedido> findAll() {
        return pedidoDao.findAll();
    }

    public Optional<Pedido> findById(Integer id) {
        return pedidoDao.findById(id);
    }


    public void save(Pedido pedido) {
        pedidoDao.save(pedido);
    }


    public void deleteById(Integer id) {
        pedidoDao.deleteById(id);
    }
}
