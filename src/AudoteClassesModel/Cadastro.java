package AudoteClassesModel;

import java.util.ArrayList;

public class Cadastro{
    private ArrayList<Usuario> usuarios;
    private String email;
    private int telefone;
    private String senha;

    public Cadastro(ArrayList<Usuario> usuario, String email, int telefone, String senha){
      this.usuarios = usuario;
      this.email = email;
      this.telefone = telefone;
      this.senha = senha;
    }    
    
    public Cadastro(Pessoa usuario, String email, int telefone, String senha) {
	}

	public ArrayList<Usuario> getUsuario() {
        return usuarios;
    }

    public void setUsuario(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void adicionarUsuario(ArrayList<Usuario> usuario) {
    	this.setUsuario(usuario);
    }
} 