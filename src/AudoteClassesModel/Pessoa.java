package AudoteClassesModel;

public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String cpf;
	private String telefone;
	private String email;
	private String senha;
	
	public Pessoa(String nome, String email, String senha, String telefone, String cpf, String endereco){
	    this.nome = nome;
	    this.endereco = endereco;
	    this.cpf = cpf;
	    this.telefone = telefone;
	    this.email = email;
	    this.endereco = endereco;
	    
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
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
}