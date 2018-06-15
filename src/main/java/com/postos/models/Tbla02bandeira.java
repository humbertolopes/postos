package com.postos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbla02bandeira {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long a02_id;
	
	@NotBlank
	private String a02_descricao;

	
	public long getA02_id() {
		return a02_id;
	}

	public void setA02_id(long a02_id) {
		this.a02_id = a02_id;
	}

	public String getA02_descricao() {
		return a02_descricao;
	}

	public void setA02_descricao(String a02_descricao) {
		this.a02_descricao = a02_descricao;
	}


}
