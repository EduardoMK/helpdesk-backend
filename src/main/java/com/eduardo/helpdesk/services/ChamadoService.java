package com.eduardo.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.eduardo.helpdesk.domain.Chamado;
import com.eduardo.helpdesk.repositories.ChamadoRepository;
import com.eduardo.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository respository;

	public Chamado findById(Integer id) {
		Optional<Chamado> obj = respository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id));
	}
}
