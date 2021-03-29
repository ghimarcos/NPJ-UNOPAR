package com.Npj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Agenda;


@Repository
public interface ComarcasRepostory extends JpaRepository<Agenda, Integer> {
	@Query(value = "Select * from agenda", nativeQuery = true)
	List<Agenda> findAllList();

}
