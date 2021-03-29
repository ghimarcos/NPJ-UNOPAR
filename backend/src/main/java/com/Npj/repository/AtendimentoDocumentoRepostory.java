package com.Npj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Npj.domain.Agenda;
import com.Npj.domain.AtendimentoDocumento;


@Repository
public interface AtendimentoDocumentoRepostory extends JpaRepository<AtendimentoDocumento, Integer> {

}
