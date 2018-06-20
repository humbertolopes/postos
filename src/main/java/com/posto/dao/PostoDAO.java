package com.posto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.posto.metadata.PostoMetadata;

public class PostoDAO {
	private DataSource dataSource;

	public PostoDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public ArrayList<PostoMetadata> getPostos(Boolean param){
		try {
			String where = "";
			if(param != null) {
				where = "where autorizado_anp_posto is " + param ;
			}
			String sql = "select "
					+ "id_posto, "
					+ "razao_social_posto, "
					+ "descricao_bandeira, "
					+ "descricao_bairro, "
					+ "endereco_posto, "
					+ "autorizado_anp_posto, "
					+ "preco_compra_gasolina_posto, "
					+ "preco_venda_gasolina_posto, "
					+ "data_preco_gasolina_posto, "
					+ "nota_fiscal_compra_gasolina_posto, "
					+ "preco_compra_alcool_posto, "
					+ "preco_venda_alcool_posto, "
					+ "data_preco_alcool_posto, "
					+ "nota_fiscal_compra_alcool_posto "
					+ "from tbl_posto "
					+ "left join tbl_bandeira on fk_id_bandeira_posto = id_bandeira "
					+ "left join tbl_bairro on fk_id_bairro_posto = id_bairro "
					+ where ;
			PreparedStatement ps = dataSource.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); 

			ArrayList<PostoMetadata> lista = new ArrayList<PostoMetadata>();
			
			while(rs.next()) {
				PostoMetadata posto = new PostoMetadata();
				posto.setId(rs.getLong("id_posto"));
				posto.setRazao_social(rs.getString("razao_social_posto"));
				posto.setBairro(rs.getString("descricao_bairro"));
				posto.setEndereco(rs.getString("endereco_posto"));
				posto.setBandeira(rs.getString("descricao_bandeira"));
				posto.setAutorizado_anp(rs.getBoolean("autorizado_anp_posto"));
				posto.setPreco_compra_gasolina(rs.getDouble("preco_compra_gasolina_posto"));
				posto.setPreco_venda_gasolina(rs.getDouble("preco_venda_gasolina_posto"));
				posto.setData_preco_gasolina(rs.getString("data_preco_gasolina_posto"));
				posto.setNota_fical_compra_gasolina(rs.getBoolean("nota_fiscal_compra_gasolina_posto"));
				posto.setPreco_compra_alcool(rs.getDouble("preco_compra_alcool_posto"));
				posto.setPreco_venda_alcool(rs.getDouble("preco_venda_alcool_posto"));
				posto.setData_preco_alcool(rs.getString("data_preco_alcool_posto"));
				posto.setNota_fical_compra_alcool(rs.getBoolean("nota_fiscal_compra_alcool_posto"));
				lista.add(posto);
			}
			ps.close();
			return lista;	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	public ArrayList<PostoMetadata> getPostosAutorizados(){
		return this.getPostos(true);		
	}
	
	public ArrayList<PostoMetadata> getPostosNaoAutorizados(){
		return this.getPostos(false);		
	}	

}
