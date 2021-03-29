package com.Npj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Comarca;

@Repository
public interface ComarcaRepostory extends JpaRepository<Comarca, Integer> {
	
	@Query(value = "Select * from comarca", nativeQuery = true)
	List<Comarca> findAllList();

}
