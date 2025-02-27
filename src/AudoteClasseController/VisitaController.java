package AudoteClasseController;

import java.util.List;
import AudoteClasseDAO.VisitaDAO;
import AudoteClassesModel.Visita;

public class VisitaController {

	private VisitaDAO visDAO;
	
	public boolean inserir(Visita visitaView) {
		visDAO = new VisitaDAO();
		return visDAO.inserir(visitaView);
	}
	
	public List<Visita> listarVisita() {
		visDAO = new VisitaDAO();
		return visDAO.listar();
	}
	
	public boolean excluir(int visitaView) {
		visDAO = new VisitaDAO();
		return visDAO.excluir(visitaView);
	}
}