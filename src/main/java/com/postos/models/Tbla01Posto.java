package com.postos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbla01Posto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long a01_id;
	
	@NotBlank
	private String a01_razao_social;
	
	@NotBlank
	private String a01_nome_fantasia;
	
	@NotBlank
	private double a01_preco_gasolina;
	
	@NotBlank
	private double a01_preco_alcool;
	

	public double getA01_preco_gasolina() {
		return a01_preco_gasolina;
	}

	public void setA01_preco_gasolina(double a01_preco_gasolina) {
		this.a01_preco_gasolina = a01_preco_gasolina;
	}

	public double getA01_preco_alcool() {
		return a01_preco_alcool;
	}

	public void setA01_preco_alcool(double a01_preco_alcool) {
		this.a01_preco_alcool = a01_preco_alcool;
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
}

