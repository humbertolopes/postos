package com.posto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbl_bandeira {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_bandeira;
	
	@NotBlank
	private String descricao_bandeira;

	public long getId_bandeira() {
		return id_bandeira;
	}

	public void setId_bandeira(long id_bandeira) {
		this.id_bandeira = id_bandeira;
	}

	public String getDescricao_bandeira() {
		return descricao_bandeira;
	}

	public void setDescricao_bandeira(String descricao_bandeira) {
		this.descricao_bandeira = descricao_bandeira;
	}

}
