package com.Npj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Agenda;
import com.Npj.domain.Atendimento;


@Repository
public interface AtendimentoRepostory extends JpaRepository<Atendimento, Integer> {
	@Query(value = "Select * from atendimento", nativeQuery = true)
	List<Atendimento> findAllList();

}
