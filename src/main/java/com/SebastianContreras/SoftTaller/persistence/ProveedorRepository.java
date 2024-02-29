package com.SebastianContreras.SoftTaller.persistence;

import com.SebastianContreras.SoftTaller.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}