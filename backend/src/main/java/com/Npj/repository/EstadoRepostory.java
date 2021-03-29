package com.Npj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Estado;


@Repository
public interface EstadoRepostory extends JpaRepository<Estado, Integer> {

}
