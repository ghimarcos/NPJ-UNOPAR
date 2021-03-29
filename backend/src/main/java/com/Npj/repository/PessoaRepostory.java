package com.Npj.repository;

import java.util.List;

import com.Npj.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Pessoa;


@Repository
public interface PessoaRepostory extends JpaRepository<Pessoa, Integer> {
	@Query(value = "Select * from pessoa", nativeQuery = true)
	List<Pessoa> findAllList();

	@Query(value = "Select * from pessoa where id = ?", nativeQuery = true)
	Pessoa buscarPorId(int id);

}


