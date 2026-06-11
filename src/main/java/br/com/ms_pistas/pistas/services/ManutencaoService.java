package br.com.ms_pistas.pistas.services;

import br.com.ms_pistas.pistas.repository.ManutencaoRepository;
import org.springframework.stereotype.Service;

@Service
public class ManutencaoService {

    private final ManutencaoRepository repository;
    private final PistaService pistaService;

    public ManutencaoService(ManutencaoRepository repository, PistaService pistaService) {
        this.repository = repository;
        this.pistaService = pistaService;
    }

    /*
    public void create(ManutencaoRequestDTO dto) {
        Pista pista = pistaService.findById(dto.runwayId());

        //log.info("Iniciando manutenção na pista {}", pista.getCodigo());

        //pista.setDisponivel(false);

        Manutencao m = Manutencao.builder()
                .descricao(dto.descricao())
                .inicio(dto.inicio())
                .fim(dto.fim())
                .pista(pista)
                .build();


        repository.save(dto);
    }

     */

}