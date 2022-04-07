package io.github.kartenascimento.agendaapi.model.repository;

import io.github.kartenascimento.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
