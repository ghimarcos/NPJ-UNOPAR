package com.Npj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Npj.domain.Agenda;
import com.Npj.domain.Atendimento;
import com.Npj.repository.AtendimentoRepostory;


@Service
public class AtendimentoService {
	@Autowired
	private AtendimentoRepostory repo;
	
	public List<Atendimento> findAll() {
		
		List<Atendimento>atendimentos = repo.findAllList();	
		
		return atendimentos;

	}
	
	public Atendimento insert(Atendimento obj) {
		return repo.save(obj);
	}

	public Optional<Atendimento> find(Integer id) {
		Optional<Atendimento> aten = repo.findById(id);
		return aten;
	}

	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
