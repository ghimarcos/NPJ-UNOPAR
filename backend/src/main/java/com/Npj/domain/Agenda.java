package com.Npj.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.Npj.domain.view.AgendaView;

@Entity
public class Agenda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonView(AgendaView.Resumo1.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//@JsonIgnoreProperties({"email", "permissoes"})
	@JsonView(AgendaView.Resumo1.class)
    @ManyToOne
	private Usuario usuario;
	@JsonView({AgendaView.Resumo1.class})
	private String descricao;
	@JsonView(AgendaView.Resumo1.class)
	private String conteudo;
	@JsonFormat(pattern="yyyy/MM/dd")
	private Date data;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Agenda(int id, Usuario usuario, String descricao, String conteudo, Date data) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.descricao = descricao;
		this.conteudo = conteudo;
		this.data = data;
	}
	public Agenda() {
		
	}

	@Override
	public String toString() {
		return "Agenda [id=" + id + ", usuario=" + usuario + ", descricao=" + descricao + ", conteudo=" + conteudo
				+ ", data=" + data + "]";
	}

	public Agenda(Agenda obj) {
		this.id = obj.getId();
		this.usuario = obj.getUsuario();
		this.descricao = obj.getDescricao();
		this.conteudo = obj.getConteudo();
		this.data = obj.getData();
	}
	

}
