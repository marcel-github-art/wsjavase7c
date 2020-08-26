package br.com.ecommerce_heranca.beans;

public class ClientePF extends Cliente{
	private String nome;
	private String cpf;
	private String rg;
	private String nascimento;
	
	public String getAll() {
		return  super.getAll() + "\n" + 
				nome + "\n" + 
				cpf + "\n" +
				rg + "\n" +
				nascimento;
	}
	
	public void setAll(int id, String email, String telefone, String nome, String cpf, String rg, String nascimento) {
		super.setAll(id, email, telefone);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	
	public ClientePF() {
		super();
	}

	public ClientePF(int id, String email, String telefone, String nome, String cpf, String rg, String nascimento) {
		super(id, email, telefone);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

}
