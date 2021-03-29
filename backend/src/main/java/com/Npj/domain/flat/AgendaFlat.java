package com.Npj.domain.flat;

import java.util.Date;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import com.Npj.domain.Agenda;
import com.Npj.domain.view.AgendaView;

public class AgendaFlat {
    @JsonView(AgendaView.Resumo1.class)
    private int id;
    @JsonView({AgendaView.Resumo1.class})
    private String descricao;
    @JsonView(AgendaView.Resumo1.class)
    private String conteudo;
    @JsonFormat(pattern="yyyy/MM/dd")
    private Date data;
    @JsonView({AgendaView.Resumo1.class})
    private Integer uId;
    @JsonView({AgendaView.Resumo1.class})
    private String uNome;
    @JsonView({AgendaView.Resumo1.class})
    private String uEmail;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Integer getuId() {
        return uId;
    }
    public void setuId(Integer uId) {
        this.uId = uId;
    }
    public String getuNome() {
        return uNome;
    }
    public void setuNome(String uNome) {
        this.uNome = uNome;
    }
    public String getuEmail() {
        return uEmail;
    }
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }
    public AgendaFlat(int id, String descricao, String conteudo, Date data, Integer uId, String uNome, String uEmail) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.conteudo = conteudo;
        this.data = data;
        this.uId = uId;
        this.uNome = uNome;
        this.uEmail = uEmail;
    }
    public AgendaFlat() {

    }
    public AgendaFlat(Agenda obj) {
        this.id = obj.getId();
        this.descricao = obj.getDescricao();
        this.conteudo = obj.getConteudo();
        this.data = obj.getData();
        this.uId = obj.getUsuario().getId();
        this.uNome = obj.getUsuario().getNome();
        this.uEmail = obj.getUsuario().getEmail();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AgendaFlat other = (AgendaFlat) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "AgendaFlat [id=" + id + ", descricao=" + descricao + ", conteudo=" + conteudo + ", data=" + data
                + ", uId=" + uId + ", uNome=" + uNome + ", uEmail=" + uEmail + "]";
    }





}
