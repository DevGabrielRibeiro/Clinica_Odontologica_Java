package OdontoVida;

import java.util.ArrayList;

public class Dentista {
	private String nome;
	private String crm;
	private String email;
	private String telefone;
	private ArrayList<Consulta> consulta;
	
	public Dentista (String nome, String crm, String email, String telefone){
		this.nome = nome;
		this.crm = crm;
		this.email = email;
		this.telefone = telefone;
		this.consulta = new ArrayList<>();
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCrm(){
		return crm;
	}
	
	public void setCrm(String crm){
		this.crm = crm;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public ArrayList<Consulta> getConsulta(){
		return consulta;
	}
	
	public void adicionarAgendamento(Consulta consulta) { 
		this.consulta.add(consulta);
	}
	
	@Override
	public String toString(){
		return "Dentista[Nome: " + nome + ", CRM: "+ crm + ", Email: " + email + " e Telefone: " + telefone + "]";
	}
}
