package com.Npj.domain;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class ProcessoPessoaPK {

	private Pessoa pessoa;

	private Processo processo;
	
	public ProcessoPessoaPK() {

	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public ProcessoPessoaPK(Pessoa pessoa, Processo processo) {
		super();
		this.pessoa = pessoa;
		this.processo = processo;
	}

	

}
