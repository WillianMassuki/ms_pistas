package br.com.ms_pistas.pistas.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Manutencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    @ManyToOne
    private Pista pista;
}