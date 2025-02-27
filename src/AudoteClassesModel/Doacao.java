package AudoteClassesModel;

	public class Doacao {
		private Animal animais;
		private Usuario usuarios;

	    public Doacao() {
	    }

	    public void adicionarAnimal(Animal animal) {
	    	animais = new Animal();
	    }
	    
	    public Animal getAnimal() {
	        return animais;
	    }

	    public void setAnimal(Animal animais) {
	        this.animais = animais;
	    }

		public Usuario getUsuarios() {
			return usuarios;
		}

		public void setUsuarios(Usuario usuario1) {
			this.usuarios = usuario1;
		}

		public void cadastrarUsuario(Usuario usuario1) {
			
		}
	}