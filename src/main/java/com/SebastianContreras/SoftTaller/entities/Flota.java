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
@Table(name = "Flota")
public class Flota {

    @Id
    @Column(nullable = false, updatable = false, length = 45)
    private String patente;

    @Column(nullable = false, unique = true)
    private Integer interno;

    @Column(length = 45)
    private String marca;

    @Column(length = 45)
    private String tipoMarca;

    @Column(length = 45)
    private String tipo;

    @Column
    private Integer cantidaEjes;

    @Column(length = 45)
    private String observaciones;

    @Column
    private LocalDate fechaAlta;

    @Column
    private LocalDate fechaBaja;

    @Column
    private Integer habilitado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mantenimiento_id_mantenimiento_id", nullable = false)
    private Mantenimiento mantenimientoIdMantenimiento;

    @OneToMany(mappedBy = "patente")
    private Set<Planilla> patentePlanillas;

}

