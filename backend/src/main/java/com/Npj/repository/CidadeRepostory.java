package com.Npj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Cidade;


@Repository
public interface CidadeRepostory extends JpaRepository<Cidade, Integer> {

}
