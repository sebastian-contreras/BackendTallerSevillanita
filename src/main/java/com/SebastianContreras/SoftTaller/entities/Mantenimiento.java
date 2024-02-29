package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Mantenimiento")

public class Mantenimiento {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMantenimiento;

    @Column(length = 75)
    private String descripcion;

    @Column
    private Integer kmsMensuales;

    @Column
    private LocalDate fechaMantenimiento;

    @Column
    private Integer habilitado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repuesto_id", nullable = false)
    private Repuesto repuesto;

    @OneToMany(mappedBy = "mantenimientoIdMantenimiento")
    private Set<Flota> mantenimientoIdMantenimientoFlotas;
}
