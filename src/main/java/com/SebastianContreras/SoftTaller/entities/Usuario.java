package com.SebastianContreras.SoftTaller.entities;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer legajo;

    @Column(length = 100)
    private String nombre;

    @Column(length = 45)
    private String categoria;
}
