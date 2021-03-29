package com.Npj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Permissao;


@Repository
public interface PermissaoRepostory extends JpaRepository<Permissao, Integer> {

}
