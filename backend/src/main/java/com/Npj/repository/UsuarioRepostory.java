package com.Npj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Agenda;
import com.Npj.domain.Usuario;




@Repository
public interface UsuarioRepostory extends JpaRepository<Usuario, Integer> {
	@Query(value = "Select * from usuario", nativeQuery = true)
	List<Usuario> findAllList();

	@Query(value = "Select * from usuario where id = ?", nativeQuery = true)
	Usuario buscarPorId(int id);
}
