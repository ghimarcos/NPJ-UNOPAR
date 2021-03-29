package com.Npj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Npj.domain.Pessoa;
import com.Npj.domain.Usuario;
import com.Npj.domain.Vara;
import com.Npj.repository.UsuarioRepostory;


@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepostory repo;
	
	public List<Usuario> findAll() {
		
		List<Usuario>usus = repo.findAllList();	
		
		return usus;

	}
	public Usuario insert(Usuario obj) {
		return repo.save(obj);
	}
	public Optional<Usuario> find(Integer id) {
		Optional<Usuario> usu = repo.findById(id);
		return usu;
	}
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public Usuario buscarOuFalhar(int id) {
		return repo.buscarPorId(id);
				
	}
	public Usuario from(Usuario obj) {
		Usuario usu = buscarOuFalhar(obj.getId());
		return repo.save(obj);
	}

}
