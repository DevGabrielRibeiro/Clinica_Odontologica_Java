package OdontoVida;

public class Consulta {
	String nomePaciente;
	String nomeDentista;
	String dataConsulta;
	String statusConsulta;
	
	public Consulta(String nomePaciente, String nomeDentista, String dataConsulta, String statusConsulta) {
		this.nomePaciente = nomePaciente;
		this.nomeDentista = nomeDentista;
		this.dataConsulta = dataConsulta;
		this.statusConsulta = statusConsulta; 
	}
	
	// Metodos Get e Set
	public String getNomePaciente() {
		return nomePaciente;
	}
	
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public String getNomeDentista() {
		return nomeDentista;
	}
	
	public void setNomeDentista(String nomeDentista) {
		this.nomeDentista = nomeDentista;
	}
	
	public String getDataConsulta() {
		return dataConsulta;
	}
	
	public void setDataNascimento(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	public String getStatusConsulta(){
		return statusConsulta;
	}
	
	public void setStatusConsulta(String statusConsulta) {
		this.statusConsulta = statusConsulta;
	}
	
	@Override
	public String toString() {
	return "Consulta[Nome do Paciente: " + nomePaciente + ", Nome do Dentista: " + nomeDentista + ", Data da consulta: " + dataConsulta + " Status da consulta: " + statusConsulta + "]";
	}
}
