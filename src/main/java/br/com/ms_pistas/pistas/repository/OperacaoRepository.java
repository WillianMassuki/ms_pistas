package br.com.ms_pistas.pistas.repository;

import br.com.ms_pistas.pistas.model.Operacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, Long> {
}