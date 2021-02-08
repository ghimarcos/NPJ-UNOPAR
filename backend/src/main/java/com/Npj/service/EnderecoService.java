package com.Npj.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.Npj.domain.Endereco;
import com.Npj.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repo;
	
	public List<Endereco> findAll() {
		List<Endereco> obj = repo.findAll();
		return obj;
	}

	public Optional<Endereco> find(Integer id) {
		Optional<Endereco> usu = repo.findById(id);
		return usu;
	}

	public Endereco insert(Endereco obj) {
		repo.save(obj);
		return obj;
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {

		}

	}





}
