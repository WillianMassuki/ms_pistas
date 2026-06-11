package br.com.ms_pistas.pistas.model;

import br.com.ms_pistas.pistas.enuns.TipoOperacaoEnum;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Operacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoOperacaoEnum tipo;

    private LocalDateTime horario;

    @ManyToOne
    private Pista pista;
}