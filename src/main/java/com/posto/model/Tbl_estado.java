package com.posto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbl_estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_estado;
	
	@NotBlank
	private String descricao_estado;

	public long getId_estado() {
		return id_estado;
	}

	public void setId_estado(long id_estado) {
		this.id_estado = id_estado;
	}

	public String getDescricao_estado() {
		return descricao_estado;
	}

	public void setDescricao_estado(String descricao_estado) {
		this.descricao_estado = descricao_estado;
	}

	

}
