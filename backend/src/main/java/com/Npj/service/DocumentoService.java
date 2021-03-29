package com.Npj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Npj.domain.Comarca;
import com.Npj.domain.Documento;
import com.Npj.domain.Vara;
import com.Npj.repository.DocumentoRepostory;


@Service
public class DocumentoService {
	@Autowired
	private DocumentoRepostory repo;
	
	public List<Documento> findAll() {
		
		List<Documento>docs = repo.findAllList();	
		
		return docs;

	}
	
	public Documento insert(Documento obj) {
		return repo.save(obj);
	}
	public Documento find(Integer id) {
		Documento doc = repo.findByCodigo(id);
		return doc;
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public Documento buscarOuFalhar(int id) {
		return repo.buscarPorId(id);
				
	}

	public Documento from(Documento obj) {
		Documento doc = buscarOuFalhar(obj.getId());	
		return repo.save(obj);
	}

}
