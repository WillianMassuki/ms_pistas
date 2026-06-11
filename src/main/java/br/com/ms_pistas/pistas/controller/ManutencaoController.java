package br.com.ms_pistas.pistas.controller;

import br.com.ms_pistas.pistas.dtos.ManutencaoRequestDTO;
import br.com.ms_pistas.pistas.services.ManutencaoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maintenance")
public class ManutencaoController {

    private final ManutencaoService service;

    public ManutencaoController(ManutencaoService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody ManutencaoRequestDTO dto) {


    }
}