package com.Npj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Agenda;
import com.Npj.domain.Comarca;
import com.Npj.domain.Vara;


@Repository
public interface VaraRepostory extends JpaRepository<Vara, Integer> {
	@Query(value = "Select * from vara", nativeQuery = true)
	List<Vara> findAllList();
	
	@Query(value = "Select * from vara where id = ?", nativeQuery = true)
	Vara buscarPorId(int id);

}
