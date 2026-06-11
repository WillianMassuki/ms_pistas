package br.com.ms_pistas.pistas.controller;

import br.com.ms_pistas.pistas.dtos.PistaRequestDTO;
import br.com.ms_pistas.pistas.dtos.PistaResponseDTO;
import br.com.ms_pistas.pistas.services.PistaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/runways")
public class PistaController {

    private final PistaService service;

    public PistaController(PistaService service) {
        this.service = service;
    }

    @PostMapping
    public PistaResponseDTO create(@RequestBody PistaRequestDTO dto) {

        return null;
    }

    /*
    @PutMapping("/{id}/availability")
    public void updateAvailability(@PathVariable Long id,
                                   @RequestParam Boolean disponivel) {
        service.updateAvailability(id, disponivel);
    }

     */
}