package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Servicio {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServicio;

    @Column(nullable = false, length = 5)
    private String conjuntoCodigo;

    @Column
    private LocalDate fechaServicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "planilla_id_planilla_id", nullable = false)
    private Planilla planillaIdPlanilla;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parte_codigo_id")
    private Parte parteCodigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_repuesto_id")
    private CompraRepuesto compraRepuesto;

}
