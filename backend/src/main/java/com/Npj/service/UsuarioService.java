package com.Npj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.Npj.domain.Usuario;
import com.Npj.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	public List<Usuario> findAll() {
		List<Usuario> obj = repo.findAll();
		return obj;
	}

	public Optional<Usuario> find(Integer id) {
		Optional<Usuario> usu = repo.findById(id);
		return usu;
	}

	public Usuario insert(Usuario obj) {
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