package AudoteClasseDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import AudoteClassesModel.Usuario;

	public class UsuarioDAO {
		private final Connection connection;
		private String endereco;

		public UsuarioDAO(Connection connection) {
			this.connection = connection;
		}

		public void cadastrarUsuario(Usuario usuario) throws SQLException {

			String sql = "insert into Usuario(nome,email,senha,telefone,cpf,endereco) values('"+usuario.getNome()+"', '"+usuario.getEmail()+"', '"+usuario.getSenha()+"', '"+usuario.getTelefone()+"', '"+usuario.getCpf()+"', '"+usuario.getEndereco()+"'); ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			connection.close();
		}

		public List<Usuario> listar() {
			List<Usuario> listaUsuarios = new ArrayList<Usuario>();
			String sql = "SELECT * FROM Usuario";

			try {
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					String nome = rs.getString("nome");
					String CPF = rs.getString("CPF");
					String numTelefone = rs.getString("numTelefone");
					String email = rs.getString("email");
					String senha = rs.getString("senha");
					Usuario usuario = new Usuario(nome, email, senha, numTelefone, CPF, endereco);

					listaUsuarios.add(usuario);
				}

				return listaUsuarios;
			} catch (SQLException e) {
				e.printStackTrace();
				return listaUsuarios;
			}
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		};

	}