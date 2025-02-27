
package AudoteClasseController;

import java.util.List;
import AudoteClasseDAO.DoacaoDAO;
import AudoteClassesModel.Doacao;

public class DoacaoController {

	private DoacaoDAO doaDAO;
	
	public boolean inserir(Doacao doacaolView) {
		doaDAO = new DoacaoDAO();
		return doaDAO.inserir(doacaolView);
	}
	
	public List<Doacao> listarAdocao() {
		doaDAO = new DoacaoDAO();
		return doaDAO.listar();
	}
	
}