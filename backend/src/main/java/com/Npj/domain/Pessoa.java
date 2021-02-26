package com.Npj.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String rg;
    private String cpf;
    

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(columnDefinition = "date",name = "data_nasc")
    private Date dataNasc;

    private String estado_civil;
    private String grau_escolar;
    private String telefone;
    private String email;
    private String documentos;

    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    @OneToOne
    private Endereco endereco;

}

