package com.Npj.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


public class UsuarioPermissao implements Serializable {
	private static final long serialVersionUID = 1L;

    private UsuarioPermissaoPK id;
	public UsuarioPermissaoPK getId() {
		return id;
	}
	public void setId(UsuarioPermissaoPK id) {
		this.id = id;
	}
    

}
