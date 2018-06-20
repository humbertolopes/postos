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
	
	public ArrayList<PostoMetadata> readAll(){
		try {
			String sql = "select "
					+ "id_posto, "
					+ "razao_social_posto, "
					+ "descricao_bandeira, "
					+ "descricao_bairro, "
					+ "endereco_posto, "
					+ "autorizado_anp_posto "
					+ "from tbl_posto "
					+ "left join tbl_bandeira on fk_id_bandeira_posto = id_bandeira "
					+ "left join tbl_bairro on fk_id_bairro_posto = id_bairro";
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
				lista.add(posto);
			}
			ps.close();
			return lista;	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	

}
