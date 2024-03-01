package com.SebastianContreras.SoftTaller.repositories;

import com.SebastianContreras.SoftTaller.entities.Parte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParteRepository extends JpaRepository<Parte, String> {
}