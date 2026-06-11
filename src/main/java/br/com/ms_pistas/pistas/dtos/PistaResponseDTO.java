package br.com.ms_pistas.pistas.dtos;

public record PistaResponseDTO(
        Long id,
        String codigo,
        Boolean disponivel
) {}