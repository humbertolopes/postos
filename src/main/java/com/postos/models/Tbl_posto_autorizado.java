package com.postos.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tbl_posto_autorizado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_posto_autorizado;
	
	private String num_aut_posto_autorizado;
	
	private String dt_publi_aut_posto_autorizado;
	
	private String cod_simp_posto_autorizado;
	
	private String cnpj_posto_autorizado;
	
	private String endereco_posto_autorizado;
	
	private String complemento_posto_autorizado;
	
	private String bairro_posto_autorizado;
	
	private String cep_posto_autorizado;
	
	private String uf_posto_autorizado;
	
	private String municipio_posto_autorizado;
	
	private String vincu_distr_posto_autorizado;
	
	private String dt_vincu_distr_posto_autorizado;
	
	private String razao_social_posto_autorizado;

	public String getNum_aut_posto_autorizado() {
		return num_aut_posto_autorizado;
	}

	public void setNum_aut_posto_autorizado(String num_aut_posto_autorizado) {
		this.num_aut_posto_autorizado = num_aut_posto_autorizado;
	}

	public String getDt_publi_aut_posto_autorizado() {
		return dt_publi_aut_posto_autorizado;
	}

	public void setDt_publi_aut_posto_autorizado(String dt_publi_aut_posto_autorizado) {
		this.dt_publi_aut_posto_autorizado = dt_publi_aut_posto_autorizado;
	}

	public String getCod_simp_posto_autorizado() {
		return cod_simp_posto_autorizado;
	}

	public void setCod_simp_posto_autorizado(String cod_simp_posto_autorizado) {
		this.cod_simp_posto_autorizado = cod_simp_posto_autorizado;
	}

	public String getCnpj_posto_autorizado() {
		return cnpj_posto_autorizado;
	}

	public void setCnpj_posto_autorizado(String cnpj_posto_autorizado) {
		this.cnpj_posto_autorizado = cnpj_posto_autorizado;
	}

	public String getEndereco_posto_autorizado() {
		return endereco_posto_autorizado;
	}

	public void setEndereco_posto_autorizado(String endereco_posto_autorizado) {
		this.endereco_posto_autorizado = endereco_posto_autorizado;
	}

	public String getComplemento_posto_autorizado() {
		return complemento_posto_autorizado;
	}

	public void setComplemento_posto_autorizado(String complemento_posto_autorizado) {
		this.complemento_posto_autorizado = complemento_posto_autorizado;
	}

	public String getBairro_posto_autorizado() {
		return bairro_posto_autorizado;
	}

	public void setBairro_posto_autorizado(String bairro_posto_autorizado) {
		this.bairro_posto_autorizado = bairro_posto_autorizado;
	}

	public String getCep_posto_autorizado() {
		return cep_posto_autorizado;
	}

	public void setCep_posto_autorizado(String cep_posto_autorizado) {
		this.cep_posto_autorizado = cep_posto_autorizado;
	}

	public String getUf_posto_autorizado() {
		return uf_posto_autorizado;
	}

	public void setUf_posto_autorizado(String uf_posto_autorizado) {
		this.uf_posto_autorizado = uf_posto_autorizado;
	}

	public String getMunicipio_posto_autorizado() {
		return municipio_posto_autorizado;
	}

	public void setMunicipio_posto_autorizado(String municipio_posto_autorizado) {
		this.municipio_posto_autorizado = municipio_posto_autorizado;
	}

	public String getVincu_distr_posto_autorizado() {
		return vincu_distr_posto_autorizado;
	}

	public void setVincu_distr_posto_autorizado(String vincu_distr_posto_autorizado) {
		this.vincu_distr_posto_autorizado = vincu_distr_posto_autorizado;
	}

	public String getDt_vincu_distr_posto_autorizado() {
		return dt_vincu_distr_posto_autorizado;
	}

	public void setDt_vincu_distr_posto_autorizado(String dt_vincu_distr_posto_autorizado) {
		this.dt_vincu_distr_posto_autorizado = dt_vincu_distr_posto_autorizado;
	}

	public String getRazao_social_posto_autorizado() {
		return razao_social_posto_autorizado;
	}

	public void setRazao_social_posto_autorizado(String razao_social_posto_autorizado) {
		this.razao_social_posto_autorizado = razao_social_posto_autorizado;
	}

	public long getId_posto_autorizado() {
		return id_posto_autorizado;
	}



}
