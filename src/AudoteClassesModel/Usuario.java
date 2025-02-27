package AudoteClassesModel;

import java.util.ArrayList;

public class Usuario extends Pessoa {

	private ArrayList<Usuario> usuarios;
	private String nome;
	private String email;
	private String senha;
	private String telefone;
	private String cpf; 
	private String endereco;

	public Usuario(String nome, String email, String senha, String telefone, String cpf, String endereco) {
		super(nome, email, senha, telefone, cpf, endereco);
	}

	public ArrayList<Usuario> getUsuario() {
        return usuarios;
    }

    public void setUsuario(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void adicionarUsuario(ArrayList<Usuario> usuario) {
    	this.setUsuario(usuario);
    }
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}