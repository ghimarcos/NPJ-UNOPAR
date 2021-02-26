package com.Npj.service;

import com.Npj.domain.Pessoa;
import com.Npj.repository.PessoaRepository;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repo;

	public List<Pessoa> findAll() {
		List<Pessoa> obj = repo.findAll();
		return obj;
	}

	public Optional<Pessoa> find(Integer id){
		Optional<Pessoa> pes = repo.findById(id);
		if (pes == null){
			try {
				throw new ObjectNotFoundException("Objeto não encontrado! Id : " + id + "...");
			} catch (ObjectNotFoundException e) {
				e.printStackTrace();
			}
		}
		return pes;
	}

	public Pessoa insert(Pessoa obj) {
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
	public Pessoa update(Pessoa obj) {
		find(obj.getId());
		System.out.println(obj);
		return repo.save(obj);
	}

}