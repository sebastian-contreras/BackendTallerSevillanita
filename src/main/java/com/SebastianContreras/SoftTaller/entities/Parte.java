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
@Table(name = "Parte")
public class Parte {


    @Id
    @Column(nullable = false, updatable = false, length = 8)
    private String codigo;

    @Column(length = 100)
    private String descripcionParte;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conjunto_codigo_id", nullable = false)
    private Conjunto conjuntoCodigo;

//    @OneToMany(mappedBy = "parteCodigo")
//    private Set<Servicio> parteCodigoServicios;

}
