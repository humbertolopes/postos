package com.posto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

;

public class DataSource {
	private String hostname;
	private int port;
	private String database;
	private String username;
	private String password;
	
	private Connection connection;
	
	public DataSource() {
		try {
			hostname = "localhost";
			port = 3306;
			database = "postos_db";
			username = "root";
			password = "";			
			String url = "jdbc:mysql://localhost:3306/postos_db";
			
			System.out.println("Conexao realizada com sucesso!");
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			connection = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			System.err.println("Erro geral "+e.getMessage());
		}
		
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public void closeDataSource() {
		try {
			connection.close();
			
		} catch (Exception e) {
			System.err.println("Erro ao desconectar "+e.getMessage());
		}
	}
}
