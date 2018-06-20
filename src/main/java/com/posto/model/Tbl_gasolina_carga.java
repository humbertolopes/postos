package com.posto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tbl_gasolina_carga {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_gasolina_carga;
	
	private String razao_social_gasolina_carga;
	
	private Double preco_compra_gasolina_carga;
	
	private Double preco_venda_gasolina_carga;
	
	private String data_coleta_gasolina_carga;
	
	private Boolean nota_fiscal_compra_gasolina_carga;
	
	public long getId_gasolina_carga() {
		return id_gasolina_carga;
	}

	public void setId_gasolina_carga(long id_gasolina_carga) {
		this.id_gasolina_carga = id_gasolina_carga;
	}

	public String getRazao_social_gasolina_carga() {
		return razao_social_gasolina_carga;
	}

	public void setRazao_social_gasolina_carga(String razao_social_gasolina_carga) {
		this.razao_social_gasolina_carga = razao_social_gasolina_carga;
	}

	
	public String getData_coleta_gasolina_carga() {
		return data_coleta_gasolina_carga;
	}

	public void setData_coleta_gasolina_carga(String data_coleta_gasolina_carga) {
		this.data_coleta_gasolina_carga = data_coleta_gasolina_carga;
	}

	public Boolean getNota_fiscal_compra_gasolina_carga() {
		return nota_fiscal_compra_gasolina_carga;
	}

	public void setNota_fiscal_compra_gasolina_carga(Boolean nota_fiscal_compra_gasolina_carga) {
		this.nota_fiscal_compra_gasolina_carga = nota_fiscal_compra_gasolina_carga;
	}

	public Double getPreco_compra_gasolina_carga() {
		return preco_compra_gasolina_carga;
	}

	public void setPreco_compra_gasolina_carga(Double preco_compra_gasolina_carga) {
		this.preco_compra_gasolina_carga = preco_compra_gasolina_carga;
	}

	public Double getPreco_venda_gasolina_carga() {
		return preco_venda_gasolina_carga;
	}

	public void setPreco_venda_gasolina_carga(Double preco_venda_gasolina_carga) {
		this.preco_venda_gasolina_carga = preco_venda_gasolina_carga;
	}

}
