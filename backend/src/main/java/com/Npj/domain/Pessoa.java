package com.Npj.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import com.Npj.domain.view.PessoaView;
@Entity
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonView(PessoaView.Resumo1.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JsonView(PessoaView.Resumo1.class)
	private String nome;
	@JsonView(PessoaView.Resumo1.class)
	private String rg;
	@JsonView(PessoaView.Resumo1.class)
	private String cpf;
	@JsonView(PessoaView.Resumo1.class)
//	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(columnDefinition = "date",name = "data_nasc")
	private LocalDateTime data_nasc;
	private String estado_civil;
	private String grau_escolar;
	@JsonView(PessoaView.Resumo1.class)
	private String telefone;
	@JsonView(PessoaView.Resumo1.class)
	private String email;
	private String documento;
	@JsonView(PessoaView.Resumo1.class)
    @OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	private String tipo;


	public Pessoa(int id, String nome, String rg, String cpf, LocalDateTime data_nasc, String estado_civil, String grau_escolar,
			String telefone, String email, String documento, Endereco endereco_id, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
		this.estado_civil = estado_civil;
		this.grau_escolar = grau_escolar;
		this.telefone = telefone;
		this.email = email;
		this.documento = documento;
		this.endereco = endereco;
		this.tipo = tipo;
	}
	
	
	public Pessoa() {
	
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", data_nasc=" + data_nasc
				+ ", estado_civil=" + estado_civil + ", grau_escolar=" + grau_escolar + ", telefone=" + telefone
				+ ", email=" + email + ", documento=" + documento + ", endereco=" + endereco + ", tipo=" + tipo
				+ "]";
	}


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(LocalDateTime data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getGrau_escolar() {
		return grau_escolar;
	}

	public void setGrau_escolar(String grau_escolar) {
		this.grau_escolar = grau_escolar;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}



