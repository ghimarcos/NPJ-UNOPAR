package com.Npj.domain;

import java.time.LocalDate;

public class Util {

	public static void main(String[] args) {
		Endereco end = new Endereco();
		Cidade cid  = new Cidade();
		Cidade cid1  = new Cidade();
		cid.setDescricao("Arapongas");
		cid1.setDescricao("Londrina");
		Estado est = new Estado();
		est.setUf("PR");
		Endereco end1 = new Endereco();
		Endereco end2 = new Endereco();
		end2.setNumero("15");
		Pessoa pes = new Pessoa();
		pes.setCpf("11111111111");
		end2.setCidade(cid);
		cid.setEstado(est);
		pes.setNome("Igor");
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);		
	}

	
}
