package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Proveedor")
public class Proveedor {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProveedor;

    @Column(length = 150)
    private String nombre;

    @Column(length = 300)
    private String direccion;

    @Column(length = 100)
    private String contacto;

    @Column(length = 50)
    private String telefono;

    @Column
    private Integer habilitado;
//
//    @OneToMany(mappedBy = "proveedorIdProveedor")
//    private Set<CompraRepuesto> proveedorIdProveedorCompraRepuestoes;
//
//    @OneToMany(mappedBy = "proveedor")
//    private Set<Neumaticos> proveedorNeumaticoses;
//
//    @OneToMany(mappedBy = "proveedorRecapado")
//    private Set<Recapado> proveedorRecapadoRecapadoes;
}
