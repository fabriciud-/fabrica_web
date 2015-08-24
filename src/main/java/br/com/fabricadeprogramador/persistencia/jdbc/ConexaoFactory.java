package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {

		String jdbcDriver="jdbc:postgresql://localhost:5432/fabricaweb";
		String usuario="postgres";
		String senha ="admin";
		
		try {
			return DriverManager.getConnection(jdbcDriver,usuario,senha);
		} catch (SQLException e) {
			//relançando o exception
			throw new RuntimeException(e);
			
		}
		
	}

}
