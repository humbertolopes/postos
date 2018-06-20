package com.posto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tbl_alcool_carga {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_alcool_carga;
	
	private String razao_social_alcool_carga;
	
	private Double preco_compra_alcool_carga;
	
	private Double preco_venda_alcool_carga;
	
	private String data_coleta_alcool_carga;
	
	private Boolean nota_fiscal_compra_alcool_carga;

	public long getId_alcool_carga() {
		return id_alcool_carga;
	}

	public void setId_alcool_carga(long id_alcool_carga) {
		this.id_alcool_carga = id_alcool_carga;
	}

	public String getRazao_social_alcool_carga() {
		return razao_social_alcool_carga;
	}

	public void setRazao_social_alcool_carga(String razao_social_alcool_carga) {
		this.razao_social_alcool_carga = razao_social_alcool_carga;
	}

	public String getData_coleta_alcool_carga() {
		return data_coleta_alcool_carga;
	}

	public void setData_coleta_alcool_carga(String data_coleta_alcool_carga) {
		this.data_coleta_alcool_carga = data_coleta_alcool_carga;
	}

	public Boolean getNota_fiscal_compra_alcool_carga() {
		return nota_fiscal_compra_alcool_carga;
	}

	public void setNota_fiscal_compra_alcool_carga(Boolean nota_fiscal_compra_alcool_carga) {
		this.nota_fiscal_compra_alcool_carga = nota_fiscal_compra_alcool_carga;
	}

	public Double getPreco_compra_alcool_carga() {
		return preco_compra_alcool_carga;
	}

	public void setPreco_compra_alcool_carga(Double preco_compra_alcool_carga) {
		this.preco_compra_alcool_carga = preco_compra_alcool_carga;
	}

	public Double getPreco_venda_alcool_carga() {
		return preco_venda_alcool_carga;
	}

	public void setPreco_venda_alcool_carga(Double preco_venda_alcool_carga) {
		this.preco_venda_alcool_carga = preco_venda_alcool_carga;
	}

	
}
