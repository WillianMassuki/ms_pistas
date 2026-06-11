package br.com.ms_pistas.pistas.dtos;


import br.com.ms_pistas.pistas.enuns.TipoOperacaoEnum;

import java.time.LocalDateTime;

public record OperacaoResponseDTO(
        Long id,
        TipoOperacaoEnum tipo,
        LocalDateTime horario,
        String runway
) {}