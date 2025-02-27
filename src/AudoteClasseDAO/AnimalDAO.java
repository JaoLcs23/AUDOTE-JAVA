package AudoteClasseDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AudoteClassesModel.Animal;

public class AnimalDAO {
private Connection conn;
	
	public AnimalDAO() {
	
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

	public boolean inserir(Animal animal) {
	
		String sql = "INSERT INTO Animal(id, nome, raca, porte, tipoAnimal, idade, personalidade) VALUES (?, ?, ?, ?, ?, ?, ?)";
			
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setInt(1, animal.getId());
			ps.setString(2, animal.getNome());
			ps.setString(3, animal.getRaca());
			ps.setString(4, animal.getPorte());
			ps.setString(5, animal.getTipoAnimal());
			ps.setInt(6, animal.getIdade());
			ps.setString(7, animal.getPersonalidade());
		
			ps.execute();
				
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Animal> listar() {
		List<Animal> listaAnimal = new ArrayList<Animal>();
		String sql = "SELECT * FROM Animal";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
				
				
				Animal animal = new Animal();
				
				listaAnimal.add(animal);
			}
	
			return listaAnimal;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return listaAnimal;
		}
	}
}