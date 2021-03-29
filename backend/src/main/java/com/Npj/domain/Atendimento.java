package com.Npj.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Atendimento implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JsonIgnoreProperties({})
	@JsonView
	@ManyToOne
	private Pessoa pessoa;
	private String motivo;
	private String descricao;
	private LocalDate datahora;	
	@OneToMany(mappedBy = "id.atendimento", cascade = CascadeType.REMOVE)
	private List<AtendimentoDocumento> atendimentodocumentos = new ArrayList<AtendimentoDocumento>();
		
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDatahora() {
		return datahora;
	}
	public void setDatahora(LocalDate datahora) {
		this.datahora = datahora;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Atendimento() {
		super();
	}
	
	public Atendimento(int id, Pessoa pessoa, String motivo, String descricao, LocalDate datahora,
			 String status) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.motivo = motivo;
		this.descricao = descricao;
		this.datahora = datahora;
	
		this.status = status;
	}
	@Override
	public String toString() {
		return "Atendimento [id=" + id + ", pessoa=" + pessoa + ", motivo=" + motivo + ", descricao=" + descricao
				+ ", datahora=" + datahora + ", status=" + status + "]";
	}
	

}
