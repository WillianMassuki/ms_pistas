package br.com.ms_pistas.pistas.model;

import jakarta.persistence.*;

@Entity
public class Pista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String codigo;

    private Boolean disponivel;
}