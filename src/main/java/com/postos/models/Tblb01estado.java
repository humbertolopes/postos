package com.postos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tblb01estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long b01_id;
	
	@NotBlank
	private String b01_descricao;

	public long getB01_id() {
		return b01_id;
	}

	public void setB01_id(long b01_id) {
		this.b01_id = b01_id;
	}

	public String getB01_descricao() {
		return b01_descricao;
	}

	public void setB01_descricao(String b01_descricao) {
		this.b01_descricao = b01_descricao;
	}
	

}
