package br.com.ms_pistas.pistas.services;

import br.com.ms_pistas.pistas.repository.PistaRepository;
import org.springframework.stereotype.Service;

@Service
public class PistaService {

    private final PistaRepository repository;

    public PistaService(PistaRepository repository) {
        this.repository = repository;
    }

    /*
    public PistaResponseDTO create(PistaRequestDTO dto) {
   //     log.info("Criando pista {}", dto.codigo());

        repository.findByCodigo(dto.codigo())
                .ifPresent(r -> { throw new BusinessException("Pista já existe"); });

        Pista pista = Pista.builder()
                .codigo(dto.codigo())
                .disponivel(true)
                .build();

        repository.save(pista);

        return new PistaResponseDTO(pista.getId(), pista.getCodigo(), pista.getDisponivel());
    }

    public Pista findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BusinessException("Pista não encontrada"));
    }

    public void updateAvailability(Long id, Boolean disponivel) {
        Pista r = findById(id);
        r.setDisponivel(disponivel);
        repository.save(r);
    }

     */
}