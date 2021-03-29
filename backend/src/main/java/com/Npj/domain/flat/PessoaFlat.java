package com.Npj.domain.flat;

import java.time.LocalDate;
import java.util.Date;

import com.Npj.domain.Pessoa;
import com.Npj.domain.view.PessoaView;

public class PessoaFlat {

//    private int idPessoa;
//    private String nome;
//    private String rg;
//    private String cpf;
//    private LocalDate data_nasc;
//    private String estado_civil;
//    private String grau_escolar;
//    private String telefone;
//    private String email;
//    private String documento;
//    private String tipo;
//    private int  idEndereco;
//    private String cep;
//    private String longradouro;
//    private String bairro;
//    private String complemento;
//    private String numero;
//    private int  idCidade;
//    private String  descricaoCidade;
//    private int  idEstado;
//    private String  uf;
//    private String  descricaoEstado;
//
//    public PessoaFlat(int idPessoa, String nome, String rg, String cpf, LocalDate data_nasc, String estado_civil,
//                      String grau_escolar, String telefone, String email, String documento, String tipo, int idEndereco,
//                      String cep, String longradouro, String bairro, String complemento, String numero, int idCidade,
//                      String descricaoCidade, int idEstado, String uf, String descricaoEstado) {
//        super();
//        this.idPessoa = idPessoa;
//        this.nome = nome;
//        this.rg = rg;
//        this.cpf = cpf;
//        this.data_nasc = data_nasc;
//        this.estado_civil = estado_civil;
//        this.grau_escolar = grau_escolar;
//        this.telefone = telefone;
//        this.email = email;
//        this.documento = documento;
//        this.tipo = tipo;
//        this.idEndereco = idEndereco;
//        this.cep = cep;
//        this.longradouro = longradouro;
//        this.bairro = bairro;
//        this.complemento = complemento;
//        this.numero = numero;
//        this.idCidade = idCidade;
//        this.descricaoCidade = descricaoCidade;
//        this.idEstado = idEstado;
//        this.uf = uf;
//        this.descricaoEstado = descricaoEstado;
//    }
//    public PessoaFlat() {
//
//    }
//    public PessoaFlat(Pessoa obj) {
//
//        this.idPessoa = obj.getId();
//        this.nome = obj.getNome();
//        this.rg = obj.getRg();
//        this.cpf = obj.getCpf();
//        this.data_nasc = obj.getData_nasc();
//        this.estado_civil = obj.getEstado_civil();
//        this.grau_escolar = obj.getGrau_escolar();
//        this.telefone = obj.getTelefone();
//        this.email = obj.getEmail();
//        this.documento = obj.getDocumento();
//        this.tipo = obj.getTipo();
//        this.idEndereco = obj.getEndereco().getId();
//        this.cep = obj.getEndereco().getCep();
//        this.longradouro = obj.getEndereco().getLongradouro();
//        this.bairro = obj.getEndereco().getBairro();
//        this.complemento = obj.getEndereco().getComplemento();
//        this.numero = obj.getEndereco().getNumero();
//        this.idCidade = obj.getEndereco().getCidade().getId();
//        this.descricaoCidade = obj.getEndereco().getCidade().getDescricao();
//        this.idEstado = obj.getEndereco().getCidade().getEstado().getId();
//        this.uf = obj.getEndereco().getCidade().getEstado().getUf();
//        this.descricaoEstado = obj.getEndereco().getCidade().getEstado().getDescricao();
//    }
//
//    public int getIdPessoa() {
//        return idPessoa;
//    }
//
//    public void setIdPessoa(int idPessoa) {
//        this.idPessoa = idPessoa;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getRg() {
//        return rg;
//    }
//
//    public void setRg(String rg) {
//        this.rg = rg;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public LocalDate getData_nasc() {
//        return data_nasc;
//    }
//
//    public void setData_nasc(LocalDate data_nasc) {
//        this.data_nasc = data_nasc;
//    }
//
//    public String getEstado_civil() {
//        return estado_civil;
//    }
//
//    public void setEstado_civil(String estado_civil) {
//        this.estado_civil = estado_civil;
//    }
//
//    public String getGrau_escolar() {
//        return grau_escolar;
//    }
//
//    public void setGrau_escolar(String grau_escolar) {
//        this.grau_escolar = grau_escolar;
//    }
//
//    public String getTelefone() {
//        return telefone;
//    }
//
//    public void setTelefone(String telefone) {
//        this.telefone = telefone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getDocumento() {
//        return documento;
//    }
//
//    public void setDocumento(String documento) {
//        this.documento = documento;
//    }
//
//    public String getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
//
//    public int getIdEndereco() {
//        return idEndereco;
//    }
//
//    public void setIdEndereco(int idEndereco) {
//        this.idEndereco = idEndereco;
//    }
//
//    public String getCep() {
//        return cep;
//    }
//
//    public void setCep(String cep) {
//        this.cep = cep;
//    }
//
//    public String getLongradouro() {
//        return longradouro;
//    }
//
//    public void setLongradouro(String longradouro) {
//        this.longradouro = longradouro;
//    }
//
//    public String getBairro() {
//        return bairro;
//    }
//
//    public void setBairro(String bairro) {
//        this.bairro = bairro;
//    }
//
//    public String getComplemento() {
//        return complemento;
//    }
//
//    public void setComplemento(String complemento) {
//        this.complemento = complemento;
//    }
//
//    public String getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }
//
//    public int getIdCidade() {
//        return idCidade;
//    }
//
//    public void setIdCidade(int idCidade) {
//        this.idCidade = idCidade;
//    }
//
//    public String getDescricaoCidade() {
//        return descricaoCidade;
//    }
//
//    public void setDescricaoCidade(String descricaoCidade) {
//        this.descricaoCidade = descricaoCidade;
//    }
//
//    public int getIdEstado() {
//        return idEstado;
//    }
//
//    public void setIdEstado(int idEstado) {
//        this.idEstado = idEstado;
//    }
//
//    public String getUf() {
//        return uf;
//    }
//
//    public void setUf(String uf) {
//        this.uf = uf;
//    }
//
//    public String getDescricaoEstado() {
//        return descricaoEstado;
//    }
//
//    public void setDescricaoEstado(String descricaoEstado) {
//        this.descricaoEstado = descricaoEstado;
//    }
}
