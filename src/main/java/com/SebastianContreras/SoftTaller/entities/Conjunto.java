package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Conjunto")
public class Conjunto {

    @Id
    @Column(nullable = false, updatable = false, length = 5)
    private String codigo;

    @Column(length = 100)
    private String descripcionConjunto;

    @OneToMany(mappedBy = "conjuntoCodigo")
    private Set<Parte> conjuntoCodigoPartes;

}
