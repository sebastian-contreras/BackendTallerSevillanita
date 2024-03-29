package com.SebastianContreras.SoftTaller.repositories;

import com.SebastianContreras.SoftTaller.entities.Conjunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConjuntoRepository extends JpaRepository<Conjunto, String> {
}