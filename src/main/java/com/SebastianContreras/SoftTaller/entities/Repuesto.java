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
@Table(name = "Repuesto")
public class Repuesto {

    @Id
    @Column(nullable = false, updatable = false, length = 8)
    private String codigo;

    @Column(length = 100)
    private String descripcion;

    @Column(length = 20)
    private String unidadMedida;

    @OneToMany(mappedBy = "repuesto")
    private Set<Mantenimiento> repuestoMantenimientoes;

//    @OneToMany(mappedBy = "repuestoCodigo")
//    private Set<CompraRepuesto> repuestoCodigoCompraRepuestoes;
}
