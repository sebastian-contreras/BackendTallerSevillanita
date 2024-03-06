package com.SebastianContreras.SoftTaller.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonManagedReference
    @OneToMany(mappedBy = "conjuntoCodigo",fetch = FetchType.LAZY)
    private Set<Parte> conjuntoCodigoPartes;

}
