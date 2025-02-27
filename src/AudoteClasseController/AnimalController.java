
package AudoteClasseController;

import java.util.List;
import AudoteClasseDAO.AnimalDAO;
import AudoteClassesModel.Animal;

public class AnimalController {

	private AnimalDAO animDAO;
	
	public boolean inserir(Animal animalView) {
		animDAO = new AnimalDAO();
		return animDAO.inserir(animalView);
	}
	
	public List<Animal> listarAdocao() {
		animDAO = new AnimalDAO();
		return animDAO.listar();
	}
	
}