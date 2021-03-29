package com.Npj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Npj.domain.Atendimento;
import com.Npj.domain.Comarca;
import com.Npj.repository.ComarcaRepostory;


@Service
public class ComarcaService {
	@Autowired
	private ComarcaRepostory repo;
	
	public List<Comarca> findAll() {
		
		List<Comarca>comarcas = repo.findAllList();	
		
		return comarcas;

	}
	public Optional<Comarca> find(Integer id) {
		Optional<Comarca> com = repo.findById(id);
		return com;
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public Comarca insert(Comarca obj) {
		return repo.save(obj);
	}

}
