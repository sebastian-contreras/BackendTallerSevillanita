package com.SebastianContreras.SoftTaller.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Neumaticos {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNeumaticos;

    @Column(length = 100)
    private String marca;

    @Column(length = 45)
    private String dimension;

    @Column
    private Boolean clase;

    @Column
    private Boolean tipo;

    @Column
    private Integer estado;

    @Column
    private LocalDate fechaAlta;

    @Column
    private LocalDate fechaBaja;

    @Column
    private Integer habilitado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedor proveedor;

    @OneToMany(mappedBy = "neumaticos")
    private Set<NovedadesNeumatico> neumaticosNovedadesNeumaticoes;
}
