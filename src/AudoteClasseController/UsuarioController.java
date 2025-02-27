
package AudoteClasseController;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import AudoteClasseDAO.Conexao;
import AudoteClasseDAO.UsuarioDAO;
import AudoteClassesModel.Usuario;
import AudoteInterface.TelaCadastro;



public class UsuarioController {

private UsuarioDAO usuarioDAO;
private TelaCadastro viewCadastro;
	
	public UsuarioController(TelaCadastro view) {
	this.viewCadastro = view;
}

	public void cadastrarUsuario() {
		
		if(viewCadastro.getTextNome().getText().equals("") || viewCadastro.getTextEmail().getText().equals("") || viewCadastro.getTextSenha().getText().equals("") || viewCadastro.getTextTelefone().getText().equals("") || viewCadastro.getTextCpf().getText().equals("") || viewCadastro.getTextEndereco().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Dados incorretos ou incompletos!");
		}
		else {
				
				String nome = viewCadastro.getTextNome().getText();
				String email = viewCadastro.getTextEmail().getText();
				String senha = viewCadastro.getTextSenha().getText();
				String telefone = viewCadastro.getTextTelefone().getText();
				String cpf = viewCadastro.getTextCpf().getText();
				String endereco = viewCadastro.getTextEndereco().getText();
				
				Usuario usuario = new Usuario(nome, email, senha, telefone, cpf, endereco);
				
			try {
				Connection conexao = new Conexao().getConnection();
				UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
				usuarioDAO.cadastrarUsuario(usuario);
				JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
				
				
			} catch (SQLException ex) {
				
				Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE,null, ex);
			}

		}
		
	}
	
	public List<Usuario> listarAdocao() {
		usuarioDAO = new UsuarioDAO(null);
		return usuarioDAO.listar();
	}
}