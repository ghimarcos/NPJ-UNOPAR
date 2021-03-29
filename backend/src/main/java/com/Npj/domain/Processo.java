package com.Npj.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Processo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @ManyToOne
	private Comarca comarca;
    @ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "processo_pessoas", joinColumns = @JoinColumn(name = "(pessoas_id"), inverseJoinColumns = @JoinColumn(name = "(processo_id"))
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    
    
    @ManyToOne
	private Vara vara;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Comarca getComarca() {
		return comarca;
	}
	public void setComarca(Comarca comarca) {
		this.comarca = comarca;
	}
	public Vara getVara() {
		return vara;
	}
	public void setVara(Vara vara) {
		this.vara = vara;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Processo(int id, Comarca comarca, Vara vara, String status) {

		this.id = id;
		this.comarca = comarca;
		this.vara = vara;
		this.status = status;
	}
	public Processo() {
		
	}
	@Override
	public String toString() {
		return "Processo [id=" + id + ", comarca=" + comarca + ", vara=" + vara + ", status="
				+ status + "]";
	}
	
	


	
}
