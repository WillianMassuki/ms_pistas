package br.com.ms_pistas.pistas.controller;

import br.com.ms_pistas.pistas.dtos.OperacaoRequestDTO;
import br.com.ms_pistas.pistas.dtos.OperacaoResponseDTO;
import br.com.ms_pistas.pistas.services.OperacaoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
public class OperacaoController {

    private final OperacaoService service;

    public OperacaoController(OperacaoService service) {
        this.service = service;
    }

    @PostMapping
    public OperacaoResponseDTO create(@RequestBody OperacaoRequestDTO dto) {


        return null;
    }
}