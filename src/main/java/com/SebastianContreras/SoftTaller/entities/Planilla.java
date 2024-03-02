package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Planilla {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlanilla;

    @Column
    private LocalDate ingresoVehiculo;

    @Column
    private Integer kmsIngreso;

    @Column
    private Integer kmsEgreso;

    @Column
    private LocalDate fechaPlanilla;

    @Column
    private LocalDate fechaIngreso;

    @Column
    private LocalDate fechaEgreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patente_id", nullable = false)
    private Flota patente;

    @OneToMany(mappedBy = "planillaIdPlanilla")
    private Set<Servicio> planillaIdPlanillaServicios;

    @OneToMany(mappedBy = "planilla")
    private Set<NovedadesNeumatico> planillaNovedadesNeumaticoes;
}
