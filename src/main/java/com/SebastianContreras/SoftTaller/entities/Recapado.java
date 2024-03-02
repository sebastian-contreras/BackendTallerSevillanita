package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;
@Entity
public class Recapado {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlanilla;

    @Column(length = 45)
    private String fechaRecapado;

    @Column
    private String estado;

    @Column(length = 45)
    private String remito;

    @Column(length = 45)
    private String factura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "neumaticos_id", nullable = false)
    private NovedadesNeumatico neumaticos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedor_recapado_id", nullable = false)
    private Proveedor proveedorRecapado;

}
