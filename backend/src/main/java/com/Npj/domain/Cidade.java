package com.Npj.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonView;
import com.Npj.domain.view.PessoaView;
@Entity
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	@JsonView(PessoaView.Resumo1.class)
	private String  descricao;
	@JsonView(PessoaView.Resumo1.class)
    @ManyToOne
	private Estado  estado;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Cidade(int id, String descricao, Estado estado) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.estado = estado;
	}
	public Cidade() {
		super();
	}
	
	
}
