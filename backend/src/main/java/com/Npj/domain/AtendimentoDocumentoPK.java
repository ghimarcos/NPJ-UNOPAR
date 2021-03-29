package com.Npj.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class AtendimentoDocumentoPK implements Serializable{
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="atendimento_id")
	private Atendimento atendimento;

	@ManyToOne
	@JoinColumn(name="documento_id")
	private Documento documento;
	

	
	public AtendimentoDocumentoPK(Atendimento atendimento, Documento documento) {
		super();
		this.atendimento = atendimento;
		this.documento = documento;
	}


	public Atendimento getAtendimento() {
		return atendimento;
	}


	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}


	public Documento getDocumento() {
		return documento;
	}


	public void setDocumento(Documento documento) {
		this.documento = documento;
	}


	public AtendimentoDocumentoPK() {

	}
	
	
}
