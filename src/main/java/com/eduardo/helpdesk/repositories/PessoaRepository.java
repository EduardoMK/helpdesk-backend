package com.eduardo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
