package AudoteClasseDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection getConnection() throws SQLException{
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Audote", "root", "admin");
		return conexao;
	}

}
