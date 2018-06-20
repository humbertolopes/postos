package com.posto.metadata;

public class PostoMetadata {
	Long id;
	String razao_social;
	String bairro;
	String endereco;
	String bandeira;
	Boolean autorizado_anp;
	
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
	

}
