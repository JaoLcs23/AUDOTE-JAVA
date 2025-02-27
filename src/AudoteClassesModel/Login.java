package AudoteClassesModel;

import java.util.ArrayList;

public class Login{
	private ArrayList<Cadastro> usuarios;    

    public Login(ArrayList<Cadastro> cadastro){
      this.usuarios = cadastro;
    } 
    
    public Login() {
	}

	public ArrayList<Cadastro> retornarCadastro() {
        return usuarios;
    }

    public void setPessoa(ArrayList<Cadastro> cadastro) {
        cadastro = new ArrayList<>();
        this.usuarios = cadastro;
    }

	public Cadastro getPessoa() {
		return null;
	}

	public void setPessoa(Cadastro cadastro) {
		
	}
}