package com.postos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tblb02municipio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long b02_id;
	
	private long b02_fk_b01;
	
	@NotBlank
	private String b02_descricao;
	
	public long getB02_id() {
		return b02_id;
	}

	public void setB02_id(long b02_id) {
		this.b02_id = b02_id;
	}

	public long getB02_fk_b01() {
		return b02_fk_b01;
	}

	public void setB02_fk_b01(long b02_fk_b01) {
		this.b02_fk_b01 = b02_fk_b01;
	}

	public String getB02_descricao() {
		return b02_descricao;
	}

	public void setB02_descricao(String b02_descricao) {
		this.b02_descricao = b02_descricao;
	}

}
