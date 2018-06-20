package com.posto.metadata;

public class PostoMetadata {
	Long id;
	String razao_social;
	String bairro;
	String endereco;
	String bandeira;
	Boolean autorizado_anp;
	Double preco_compra_gasolina;
	Double preco_venda_gasolina;
	String data_preco_gasolina;
	Boolean nota_fical_compra_gasolina;
	Double preco_compra_alcool;
	Double preco_venda_alcool;
	String data_preco_alcool;
	Boolean nota_fical_compra_alcool;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Boolean getAutorizado_anp() {
		return autorizado_anp;
	}
	public void setAutorizado_anp(Boolean autorizado_anp) {
		this.autorizado_anp = autorizado_anp;
	}
	
	public String getData_preco_gasolina() {
		return data_preco_gasolina;
	}
	public void setData_preco_gasolina(String data_preco_gasolina) {
		this.data_preco_gasolina = data_preco_gasolina;
	}
	public Boolean getNota_fical_compra_gasolina() {
		return nota_fical_compra_gasolina;
	}
	public void setNota_fical_compra_gasolina(Boolean nota_fical_compra_gasolina) {
		this.nota_fical_compra_gasolina = nota_fical_compra_gasolina;
	}
	public String getData_preco_alcool() {
		return data_preco_alcool;
	}
	public void setData_preco_alcool(String data_preco_alcool) {
		this.data_preco_alcool = data_preco_alcool;
	}
	public Boolean getNota_fical_compra_alcool() {
		return nota_fical_compra_alcool;
	}
	public void setNota_fical_compra_alcool(Boolean nota_fical_compra_alcool) {
		this.nota_fical_compra_alcool = nota_fical_compra_alcool;
	}
	public Double getPreco_compra_gasolina() {
		return preco_compra_gasolina;
	}
	public void setPreco_compra_gasolina(Double preco_compra_gasolina) {
		this.preco_compra_gasolina = preco_compra_gasolina;
	}
	public Double getPreco_venda_gasolina() {
		return preco_venda_gasolina;
	}
	public void setPreco_venda_gasolina(Double preco_venda_gasolina) {
		this.preco_venda_gasolina = preco_venda_gasolina;
	}
	public Double getPreco_compra_alcool() {
		return preco_compra_alcool;
	}
	public void setPreco_compra_alcool(Double preco_compra_alcool) {
		this.preco_compra_alcool = preco_compra_alcool;
	}
	public Double getPreco_venda_alcool() {
		return preco_venda_alcool;
	}
	public void setPreco_venda_alcool(Double preco_venda_alcool) {
		this.preco_venda_alcool = preco_venda_alcool;
	}
	

}
