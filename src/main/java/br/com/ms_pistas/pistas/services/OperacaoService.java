package br.com.ms_pistas.pistas.services;

import br.com.ms_pistas.pistas.repository.OperacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class OperacaoService {

    private final OperacaoRepository repository;
    private final PistaService pistaService;

    public OperacaoService(OperacaoRepository repository, PistaService pistaService) {
        this.repository = repository;
        this.pistaService = pistaService;
    }

    /*
    public OperacaoResponseDTO create(OperacaoRequestDTO dto) {
        Pista pista = pistaService.findById(dto.runwayId());

        if (!pista.getDisponivel()) {
            throw new RuntimeException("Pista indisponível");
        }

        log.info("Registrando operação {} na pista {}", dto.tipo(), pista.getCodigo());

        Operacao op = Operacao.builder()
                .tipo(dto.tipo())
                .horario(dto.horario())
                .pista(pista)
                .build();

        repository.save(op);

        return new OperacaoResponseDTO(
                op.getId(),
                op.getTipo(),
                op.getHorario(),
                pista.getCodigo()
        );
    }

     */
}