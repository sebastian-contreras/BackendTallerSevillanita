package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pedido {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;

    @Column(nullable = false, length = 45)
    private String patente;

    @Column(length = 100)
    private String chofer;

    @Column
    private Integer kilometrajePedido;

    @Column(columnDefinition = "longtext")
    private String problemas;

    @Column
    private LocalDate fechaPedido;

    @Column
    private LocalDate fechaLlegada;

    @Column
    private Boolean estado;

//    @OneToMany(mappedBy = "pedido")
//    private Set<Planilla> pedidoPlanillas;

}
