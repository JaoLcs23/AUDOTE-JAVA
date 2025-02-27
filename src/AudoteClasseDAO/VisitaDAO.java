package AudoteClasseDAO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import AudoteClassesModel.Usuario;
import AudoteClassesModel.Visita;

public class VisitaDAO {
	private Connection conn;
	private int endereco;

	public VisitaDAO() {
	
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

	public boolean inserir(Visita visita) {
	
		String sql = "INSERT INTO Visita(endereco, dia, horario) VALUES (?, ?, ?)";
			
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ps.setString(1, visita.getEndereco());
			ps.setString(2, visita.getDia());
			ps.setString(3, visita.getHorario());
		
			ps.execute();
				
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Visita> listar() {
		List<Visita> listaVisita = new ArrayList<Visita>();
		String sql = "SELECT * FROM Visita";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
				String endereco = rs.getString("endereco");
				String dia = rs.getString("dia");
				String horario = rs.getString("horario");


				Visita visita = new Visita(endereco, dia, horario);
		
				listaVisita.add(visita);
			}
	
			return listaVisita;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return listaVisita;
		}
	}

	public boolean excluir(int id){
		try{
			String sql = "DELETE FROM Visita WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ps.execute();
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public int getEndereco() {
		return endereco;
	}

	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
}