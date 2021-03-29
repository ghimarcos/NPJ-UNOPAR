package com.Npj.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class UsuarioPermissaoPK {

    private Usuario usuario;
	

    private Permissao permissao;
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Permissao getPermissao() {
		return permissao;
	}
	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}
	public UsuarioPermissaoPK(Usuario usuario, Permissao permissao) {
	
		this.usuario = usuario;
		this.permissao = permissao;
	}
	public UsuarioPermissaoPK() {
	
	}
    
    
    
}
    
    
    
