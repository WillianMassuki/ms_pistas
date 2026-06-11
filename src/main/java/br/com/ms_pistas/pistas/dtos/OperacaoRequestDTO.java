package br.com.ms_pistas.pistas.dtos;


import br.com.ms_pistas.pistas.enuns.TipoOperacaoEnum;

import java.time.LocalDateTime;

public record OperacaoRequestDTO(
        TipoOperacaoEnum tipo,
        LocalDateTime horario,
        Long runwayId
) {}