package com.eduardo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}