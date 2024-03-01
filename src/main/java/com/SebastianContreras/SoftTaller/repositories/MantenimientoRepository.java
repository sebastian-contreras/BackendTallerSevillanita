package com.SebastianContreras.SoftTaller.repositories;

import com.SebastianContreras.SoftTaller.entities.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Integer> {
}