package com.Npj.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class AtendimentoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private AtendimentoDocumentoPK id;
	
	
	private LocalDate data;
	public AtendimentoDocumentoPK getId() {
		return id;
	}
	public void setId(AtendimentoDocumentoPK id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public AtendimentoDocumento(AtendimentoDocumentoPK id, LocalDate data) {
		super();
		this.id = id;
		this.data = data;
	}
	public AtendimentoDocumento() {
		super();
	}
	@Override
	public String toString() {
		return "AtendimentoDocumento [id=" + id + ", data=" + data + "]";
	}
	

}
