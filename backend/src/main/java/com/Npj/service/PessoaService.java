package com.Npj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Npj.domain.Documento;
import com.Npj.domain.Pessoa;
import com.Npj.domain.flat.PessoaFlat;
import com.Npj.repository.PessoaRepostory;


@Service
public class PessoaService {
	@Autowired
	private PessoaRepostory repo;

	//Método FindAll pessoaflat
//	public List<PessoaFlat> findAll() {
//		List<PessoaFlat> pFlats = new ArrayList<PessoaFlat>();
//		List<Pessoa>pes = repo.findAllList();
//		for( Pessoa p : pes) {
//			PessoaFlat pf = new PessoaFlat(p);
//			pFlats.add(pf);
//		}
//
//		return pFlats;
//
//	}

	//Método findAll pessoa
	public List<Pessoa> findAll() {
		List<Pessoa> obj = repo.findAll();
		return obj;
	}

	public Pessoa insert(Pessoa obj) {
		repo.save(obj);
		return obj;
	}

	public Pessoa from(Pessoa obj) {
		return repo.save(obj);
	}
	public Optional<Pessoa> find(Integer id) {
		Optional<Pessoa> pes = repo.findById(id);
		return pes;
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
