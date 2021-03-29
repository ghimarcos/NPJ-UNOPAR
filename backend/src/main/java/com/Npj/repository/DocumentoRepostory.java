package com.Npj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.Npj.domain.Documento;


@Repository
public interface DocumentoRepostory extends JpaRepository<Documento, Integer> {

	@Query(value = "Select * from documento", nativeQuery = true)
	List<Documento> findAllList();
	@Query(value = "Select * from documento where id = ?", nativeQuery = true)
	Documento findByCodigo(Integer id);
	
	@Query(value = "Select * from documento where id = ?", nativeQuery = true)
	Documento buscarPorId(int id);
}
