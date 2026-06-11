package br.com.ms_pistas.pistas.dtos;

import java.time.LocalDateTime;

public record ManutencaoRequestDTO(
        String descricao,
        LocalDateTime inicio,
        LocalDateTime fim,
        Long runwayId
) {}