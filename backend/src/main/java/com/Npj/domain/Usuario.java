package com.Npj.domain;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;



@Data
@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;


	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(columnDefinition = "date")
	private Date dataNasc;

	@JsonIgnoreProperties({"usuario","id"})
	@OneToMany(mappedBy = "usuario")
	private List<Endereco> ends = new ArrayList<>();

	//private Perfil perfil;

}
