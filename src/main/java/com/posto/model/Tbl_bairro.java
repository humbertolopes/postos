package com.posto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbl_bairro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_bairro;
	
	@NotBlank
	private String descricao_bairro;

	public String getDescricao_bairro() {
		return descricao_bairro;
	}

	public void setDescricao_bairro(String descricao_bairro) {
		this.descricao_bairro = descricao_bairro;
	}

	public long getId_bairro() {
		return id_bairro;
	}

}
