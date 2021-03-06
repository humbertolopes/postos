package com.posto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Tbl_posto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_posto;
	
	private long fk_id_municipio_posto;
	
	private long fk_id_bandeira_posto;
	
	private long fk_id_bairro_posto;
	
	private String endereco_posto;
	
	@NotBlank
	private String razao_social_posto;
	
	private String nome_fantasia_posto;
	
	private Boolean autorizado_anp_posto;
	
	private Double preco_compra_gasolina_posto;
	
	private Double preco_venda_gasolina_posto;
	
	private String data_preco_gasolina_posto;
	
	private Boolean nota_fiscal_compra_gasolina_posto;
	
	private Double preco_compra_alcool_posto;
	
	private Double preco_venda_alcool_posto;
	
	private String data_preco_alcool_posto;
	
	private Boolean nota_fiscal_compra_alcool_posto;
	
	private Boolean aceita_credito_posto;
	
	private Boolean acrescimo_credito_posto;
	
	private Long porcentagem_acrescimo_cartao_posto;
	
	private Double preco_gasolina_usuario_posto;
	
	private Double preco_alcool_usuario_posto;
	

	public Boolean getAutorizado_anp_posto() {
		return autorizado_anp_posto;
	}

	public void setAutorizado_anp_posto(Boolean autorizado_anp_posto) {
		this.autorizado_anp_posto = autorizado_anp_posto;
	}

	public long getId_posto() {
		return id_posto;
	}

	public void setId_posto(long id_posto) {
		this.id_posto = id_posto;
	}

	public long getFk_id_municipio_posto() {
		return fk_id_municipio_posto;
	}

	public void setFk_id_municipio_posto(long fk_id_municipio_posto) {
		this.fk_id_municipio_posto = fk_id_municipio_posto;
	}

	public long getFk_id_bandeira_posto() {
		return fk_id_bandeira_posto;
	}

	public void setFk_id_bandeira_posto(long fk_id_bandeira_posto) {
		this.fk_id_bandeira_posto = fk_id_bandeira_posto;
	}

	public String getRazao_social_posto() {
		return razao_social_posto;
	}

	public void setRazao_social_posto(String razao_social_posto) {
		this.razao_social_posto = razao_social_posto;
	}

	public String getNome_fantasia_posto() {
		return nome_fantasia_posto;
	}

	public void setNome_fantasia_posto(String nome_fantasia_posto) {
		this.nome_fantasia_posto = nome_fantasia_posto;
	}
	
	public long getFk_id_bairro_posto() {
		return fk_id_bairro_posto;
	}

	public void setFk_id_bairro_posto(long fk_id_bairro_posto) {
		this.fk_id_bairro_posto = fk_id_bairro_posto;
	}

	public String getEndereco_posto() {
		return endereco_posto;
	}

	public void setEndereco_posto(String endereco_posto) {
		this.endereco_posto = endereco_posto;
	}

	public Boolean getAceita_credito_posto() {
		return aceita_credito_posto;
	}

	public void setAceita_credito_posto(Boolean aceita_credito_posto) {
		this.aceita_credito_posto = aceita_credito_posto;
	}

	public Boolean getAcrescimo_credito_posto() {
		return acrescimo_credito_posto;
	}

	public void setAcrescimo_credito_posto(Boolean acrescimo_credito_posto) {
		this.acrescimo_credito_posto = acrescimo_credito_posto;
	}

	public String getData_preco_gasolina_posto() {
		return data_preco_gasolina_posto;
	}

	public void setData_preco_gasolina_posto(String data_preco_gasolina_posto) {
		this.data_preco_gasolina_posto = data_preco_gasolina_posto;
	}

	public Boolean getNota_fiscal_compra_gasolina_posto() {
		return nota_fiscal_compra_gasolina_posto;
	}

	public void setNota_fiscal_compra_gasolina_posto(Boolean nota_fiscal_compra_gasolina_posto) {
		this.nota_fiscal_compra_gasolina_posto = nota_fiscal_compra_gasolina_posto;
	}

	public String getData_preco_alcool_posto() {
		return data_preco_alcool_posto;
	}

	public void setData_preco_alcool_posto(String data_preco_alcool_posto) {
		this.data_preco_alcool_posto = data_preco_alcool_posto;
	}

	public Boolean getNota_fiscal_compra_alcool_posto() {
		return nota_fiscal_compra_alcool_posto;
	}

	public void setNota_fiscal_compra_alcool_posto(Boolean nota_fiscal_compra_alcool_posto) {
		this.nota_fiscal_compra_alcool_posto = nota_fiscal_compra_alcool_posto;
	}

	public Double getPreco_compra_gasolina_posto() {
		return preco_compra_gasolina_posto;
	}

	public void setPreco_compra_gasolina_posto(Double preco_compra_gasolina_posto) {
		this.preco_compra_gasolina_posto = preco_compra_gasolina_posto;
	}

	public Double getPreco_venda_gasolina_posto() {
		return preco_venda_gasolina_posto;
	}

	public void setPreco_venda_gasolina_posto(Double preco_venda_gasolina_posto) {
		this.preco_venda_gasolina_posto = preco_venda_gasolina_posto;
	}

	public Double getPreco_compra_alcool_posto() {
		return preco_compra_alcool_posto;
	}

	public void setPreco_compra_alcool_posto(Double preco_compra_alcool_posto) {
		this.preco_compra_alcool_posto = preco_compra_alcool_posto;
	}

	public Double getPreco_venda_alcool_posto() {
		return preco_venda_alcool_posto;
	}

	public void setPreco_venda_alcool_posto(Double preco_venda_alcool_posto) {
		this.preco_venda_alcool_posto = preco_venda_alcool_posto;
	}

	public Long getPorcentagem_acrescimo_cartao_posto() {
		return porcentagem_acrescimo_cartao_posto;
	}

	public void setPorcentagem_acrescimo_cartao_posto(Long porcentagem_acrescimo_cartao_posto) {
		this.porcentagem_acrescimo_cartao_posto = porcentagem_acrescimo_cartao_posto;
	}

	public Double getPreco_gasolina_usuario_posto() {
		return preco_gasolina_usuario_posto;
	}

	public void setPreco_gasolina_usuario_posto(Double preco_gasolina_usuario_posto) {
		this.preco_gasolina_usuario_posto = preco_gasolina_usuario_posto;
	}

	public Double getPreco_alcool_usuario_posto() {
		return preco_alcool_usuario_posto;
	}

	public void setPreco_alcool_usuario_posto(Double preco_alcool_usuario_posto) {
		this.preco_alcool_usuario_posto = preco_alcool_usuario_posto;
	}

}

