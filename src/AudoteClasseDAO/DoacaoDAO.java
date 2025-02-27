package AudoteClasseDAO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AudoteClassesModel.Doacao;

public class DoacaoDAO {
	private Connection conn;
	
	public DoacaoDAO() {
	
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

	public boolean inserir(Doacao doacao) {
	
		String sql = "INSERT INTO Doacao() VALUES ()";
			
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, doacao.getAnimal().getNome());
			ps.setString(2, doacao.getUsuarios().getNome());
		
			ps.execute();
				
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Doacao> listar() {
		List<Doacao> listaDoacao = new ArrayList<Doacao>();
		String sql = "SELECT * FROM Doacao";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
				
				Doacao doacao = new Doacao();
				
				listaDoacao.add(doacao);
			}
	
			return listaDoacao;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return listaDoacao;
		}
	}
}