package com.Npj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Processo;


@Repository
public interface ProcessoRepostory extends JpaRepository<Processo, Integer> {

}
