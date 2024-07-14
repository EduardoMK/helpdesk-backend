package com.eduardo.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.helpdesk.domain.Chamado;
import com.eduardo.helpdesk.domain.Cliente;
import com.eduardo.helpdesk.domain.Tecnico;
import com.eduardo.helpdesk.domain.enums.Perfil;
import com.eduardo.helpdesk.domain.enums.Prioridade;
import com.eduardo.helpdesk.domain.enums.Status;
import com.eduardo.helpdesk.repositories.ChamadoRepository;
import com.eduardo.helpdesk.repositories.ClienteRepository;
import com.eduardo.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Eduardo Konzen", "00847766098", "eduardokonz@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Rafaela Back", "95290486020", "back.rafaela@hotmail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ABERTO.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
