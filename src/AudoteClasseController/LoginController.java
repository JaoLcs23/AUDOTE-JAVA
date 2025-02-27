
package AudoteClasseController;

import AudoteClasseDAO.LoginDAO;
import AudoteClassesModel.Login;

public class LoginController {

	private LoginDAO LogDAO;
	
	public boolean inserir(Login animalView) {
		LogDAO = new LoginDAO();
		return LogDAO.inserir(animalView);
	}
}