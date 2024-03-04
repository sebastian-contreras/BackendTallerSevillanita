package com.SebastianContreras.SoftTaller.repositories;

import com.SebastianContreras.SoftTaller.entities.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}