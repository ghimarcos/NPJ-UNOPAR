package com.Npj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Endereco;


@Repository
public interface EnderecoRepostory extends JpaRepository<Endereco, Integer> {

}
