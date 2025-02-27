package AudoteClassesModel;

public class Visita {
	String endereco;
	private String dia;
	private String horario;

    public Visita(String end2, String dia2, String horario2) {
    }

    public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void requisitarHorarioDia() {
		this.setHorario(horario);
		this.setDia(dia);
	}
}