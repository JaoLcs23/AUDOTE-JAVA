package AudoteClasseDAO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AudoteClassesModel.Adocao;

public class AdocaoDAO {
	private Connection conn;
	
	public AdocaoDAO() {
	
		this.conn = null;
		String url = "jdbc:mysql://localhost:3306/Audote";
		String user = "root";
		String password = "admin";
	
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão com banco de dados estabelecida");
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
}

	public boolean inserir(Adocao adocao) {
	
		String sql = "INSERT INTO Adocao() VALUES ()";
			
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, adocao.getAnimal().getNome());
			ps.setString(2, adocao.getUsuarios().getNome());
		
			ps.execute();
				
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Adocao> listar() {
		List<Adocao> listaAdocao = new ArrayList<Adocao>();
		String sql = "SELECT * FROM Adocao";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
				
				
				Adocao adocao = new Adocao();
				
				listaAdocao.add(adocao);
			}
	
			return listaAdocao;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return listaAdocao;
		}
	}
}