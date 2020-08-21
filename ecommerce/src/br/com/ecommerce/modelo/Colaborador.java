package br.com.ecommerce.modelo;

public class Colaborador {

	private int id;
	private String nome;
	private String email;
	private String fone;
	private String nascimento;
	private String cargo;
	private float salario;
	
	public String getLogin() {
		if (email.indexOf("@")>0) {
			return email.substring(0, email.indexOf("@"));
		}
		return email;
	}
	
	public String getBasico() {
		return
				"Colaborador.: " + nome + "\n" +
				"Email.......: " + email + "\n" + 
				"Fone........: " + fone;
	}
	
	public void gerarAumento(float porc) {
		if (porc<0) {
			salario = salario + salario * (porc/100);
		}
	}
	
	public String getAll() {
		return 
				id + "\n" +
				nome + "\n" + 
				email + "\n" + 
				fone + "\n" + 
				nascimento + "\n" + 
				cargo + "\n" + 
				salario;
	}
	
	public void setAll(int id, String nome, String email, String fone, String nascimento, String cargo, float salario) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.nascimento = nascimento;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Colaborador() {
		super();
	}
	public Colaborador(int id, String nome, String email, String fone, String nascimento, String cargo, float salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.nascimento = nascimento;
		this.cargo = cargo;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
