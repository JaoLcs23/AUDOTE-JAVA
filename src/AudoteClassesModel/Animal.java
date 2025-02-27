package AudoteClassesModel;

public class Animal {
	  private int id;
	  private String nome;
	  private String raca;
	  private String porte;
	  private String tipoAnimal;
	  private int idade;
	  private String personalidade;

	  public Animal(int id, String nome, String raca, String porte, String tipoAnimal, int idade, String personalidade) {
	    this.id = id;
		this.nome = nome;
	    this.raca = raca;
	    this.porte = porte;
	    this.tipoAnimal = tipoAnimal;
	    this.idade = idade;
	    this.personalidade = personalidade;
	  }

	  public Animal() {
	}

	public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public String getRaca() {
	    return raca;
	  }

	  public void setRaca(String raca) {
	    this.raca = raca;
	  }

	  public String getPorte() {
	    return porte;
	  }

	  public void setPorte(String porte) {
	    this.porte = porte;
	  }

	  public int getIdade() {
	    return idade;
	  }

	  public void setIdade(int idade) {
	    this.idade = idade;
	  }

	  public String getPersonalidade() {
	    return personalidade;
	  }

	  public void setPersonalidade(String personalidade) {
	    this.personalidade = personalidade;
	  }

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	}