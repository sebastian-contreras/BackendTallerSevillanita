package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class CompraRepuesto {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;

    @Column(length = 45)
    private String factura;

    @Column
    private Double importe;

    @Column
    private LocalDate fechaCompra;

    @Column
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedor_id_proveedor_id", nullable = false)
    private Proveedor proveedorIdProveedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repuesto_codigo_id", nullable = false)
    private Repuesto repuestoCodigo;

    @OneToMany(mappedBy = "compraRepuesto")
    private Set<Servicio> compraRepuestoServicios;
}
