package com.postos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbla01posto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long a01_id;
	
	private long a01_fk_b02_id;
	
	private long a01_fk_a02_id;
	
	@NotBlank
	private String a01_razao_social;
	
	
	private String a01_nome_fantasia;
	
	
	public long getA01_fk_b02_id() {
		return a01_fk_b02_id;
	}

	public void setA01_fk_b02_id(long a01_fk_b02_id) {
		this.a01_fk_b02_id = a01_fk_b02_id;
	}

	public long getA01_id() {
		return a01_id;
	}

	public void setA01_id(long a01_id) {
		this.a01_id = a01_id;
	}

	public String getA01_razao_social() {
		return a01_razao_social;
	}

	public void setA01_razao_social(String a01_razao_social) {
		this.a01_razao_social = a01_razao_social;
	}

	public String getA01_nome_fantasia() {
		return a01_nome_fantasia;
	}

	public void setA01_nome_fantasia(String a01_nome_fantasia) {
		this.a01_nome_fantasia = a01_nome_fantasia;
	}
	
	public long getA01_fk_a02_id() {
		return a01_fk_a02_id;
	}

	public void setA01_fk_a02_id(long a01_fk_a02_id) {
		this.a01_fk_a02_id = a01_fk_a02_id;
	}
}

