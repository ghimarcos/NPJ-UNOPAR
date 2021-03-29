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
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	@JsonView(PessoaView.Resumo1.class)
	private String cep;
	private String longradouro;
	private String bairro;
	private String complemento;
	private String numero;
	@JsonView(PessoaView.Resumo1.class)
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Cidade cidade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLongradouro() {
		return longradouro;
	}
	public void setLongradouro(String longradouro) {
		this.longradouro = longradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Endereco(int id, String cep, String longradouro, String bairro, String complemento, String numero,
			Cidade cidade) {
		super();
		this.id = id;
		this.cep = cep;
		this.longradouro = longradouro;
		this.bairro = bairro;
		this.complemento = complemento;
		this.numero = numero;
		this.cidade = cidade;
	}
	public Endereco() {
	}
	
	

}
