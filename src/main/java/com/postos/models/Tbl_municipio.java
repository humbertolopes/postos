package com.postos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbl_municipio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_municipio;
	
	private long fk_id_estado_municipio;
	
	@NotBlank
	private String descricao_municipio;

	public long getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(long id_municipio) {
		this.id_municipio = id_municipio;
	}

	public long getFk_id_estado_municipio() {
		return fk_id_estado_municipio;
	}

	public void setFk_id_estado_municipio(long fk_id_estado_municipio) {
		this.fk_id_estado_municipio = fk_id_estado_municipio;
	}

	public String getDescricao_municipio() {
		return descricao_municipio;
	}

	public void setDescricao_municipio(String descricao_municipio) {
		this.descricao_municipio = descricao_municipio;
	}
	
	
}
