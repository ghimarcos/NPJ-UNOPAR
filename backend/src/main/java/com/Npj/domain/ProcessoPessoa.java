package com.Npj.domain;

import javax.persistence.EmbeddedId;

public class ProcessoPessoa {

    private ProcessoPessoaPK id;

	public ProcessoPessoaPK getId() {
		return id;
	}

	public void setId(ProcessoPessoaPK id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ProcessoPessoa [id=" + id + "]";
	}

	public ProcessoPessoa(ProcessoPessoaPK id) {
		super();
		this.id = id;
	}
	public ProcessoPessoa() {
		super();
		}
	
}
