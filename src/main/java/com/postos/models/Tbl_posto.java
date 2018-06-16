package com.postos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbl_posto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_posto;
	
	private long fk_id_municipio_posto;
	
	private long fk_id_bandeira_posto;
	
	@NotBlank
	private String razao_social_posto;
	
	private String nome_fantasia_posto;
	
	private int autorizado_anp_posto;

	
	public int getAutorizado_anp_posto() {
		return autorizado_anp_posto;
	}

	public void setAutorizado_anp_posto(int autorizado_anp_posto) {
		this.autorizado_anp_posto = autorizado_anp_posto;
	}

	public long getId_posto() {
		return id_posto;
	}

	public void setId_posto(long id_posto) {
		this.id_posto = id_posto;
	}

	public long getFk_id_municipio_posto() {
		return fk_id_municipio_posto;
	}

	public void setFk_id_municipio_posto(long fk_id_municipio_posto) {
		this.fk_id_municipio_posto = fk_id_municipio_posto;
	}

	public long getFk_id_bandeira_posto() {
		return fk_id_bandeira_posto;
	}

	public void setFk_id_bandeira_posto(long fk_id_bandeira_posto) {
		this.fk_id_bandeira_posto = fk_id_bandeira_posto;
	}

	public String getRazao_social_posto() {
		return razao_social_posto;
	}

	public void setRazao_social_posto(String razao_social_posto) {
		this.razao_social_posto = razao_social_posto;
	}

	public String getNome_fantasia_posto() {
		return nome_fantasia_posto;
	}

	public void setNome_fantasia_posto(String nome_fantasia_posto) {
		this.nome_fantasia_posto = nome_fantasia_posto;
	}	

}
