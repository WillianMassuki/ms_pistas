package br.com.ms_pistas.pistas.repository;

import br.com.ms_pistas.pistas.model.Pista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PistaRepository extends JpaRepository<Pista, Long> {
    Optional<Pista> findByCodigo(String codigo);
}