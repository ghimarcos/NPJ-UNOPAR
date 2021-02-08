package com.Npj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	
}
