package OdontoVida;

import java.util.ArrayList;

public class Paciente {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String endereco;
	private String dataNascimento;
	private ArrayList<Consulta> consulta;
	
	public Paciente(String nome, String cpf, String telefone, String email, String endereco, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.consulta = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public ArrayList<Consulta> getConsulta(){
		return consulta;
	}
	
	public void adicionarAgendamento(Consulta consulta) { 
		this.consulta.add(consulta);
	}
	
	@Override
	public String toString(){
		return "Paciente[Nome: " + nome +", CPF: "+ cpf + ", Telefone: " + telefone + ",Email: " + email +", Endereco: " + endereco + " e Data de Nascimento:"+ dataNascimento + "]";
	}
}
