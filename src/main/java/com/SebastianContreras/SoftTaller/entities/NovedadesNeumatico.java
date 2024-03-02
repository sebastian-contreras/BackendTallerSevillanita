package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class NovedadesNeumatico {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDate fechaAccion;

    @Column(length = 3)
    private String posicion;

    @Column
    private String accion;

    @Column
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "neumaticos_id", nullable = false)
    private Neumaticos neumaticos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "planilla_id", nullable = false)
    private Planilla planilla;

    @OneToMany(mappedBy = "neumaticos")
    private Set<Recapado> neumaticosRecapadoes;

}
