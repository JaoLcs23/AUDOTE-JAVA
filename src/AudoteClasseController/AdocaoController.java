package AudoteClasseController;

import java.util.List;
import AudoteClasseDAO.AdocaoDAO;
import AudoteClassesModel.Adocao;

public class AdocaoController {

	private AdocaoDAO adocDAO;
	
	public boolean inserir(Adocao adocaoView) {
		adocDAO = new AdocaoDAO();
		return adocDAO.inserir(adocaoView);
	}
	
	public List<Adocao> listarAdocao() {
		adocDAO = new AdocaoDAO();
		return adocDAO.listar();
	}
}
