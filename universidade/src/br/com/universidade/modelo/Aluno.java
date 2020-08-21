package br.com.universidade.modelo;
/*
 * Modelo==model==beans==dto (data transfer object)==to
 * Design Pattern DTO
 * 1º Todos os atributos devem ser privados
 * 2º Cada atributo deve ter um método getter e um metodo setter
 * 3º Todo Beans deve possuir no mínimo dois construtores 
 * (vazio, cheio - preenchendo todos os atributos) 
 */
// Sintaxe dos métodos
// <modificador> <retorno do método> <nome do método> (<tipo Param> <nome Param>, ...)
public class Aluno {
	private String nome;
	private String email;
	private int rm;
	private Endereco endereco; 
		
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

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Aluno() {}
	
	public Aluno(String nome, String email, int rm, Endereco endereco) {
		this.nome=nome;
		this.email=email;
		this.rm=rm;
		this.endereco=endereco;
	}
	
	public String getAll() {
		return nome + "\n" + email + "\n" + rm + "\n" + endereco.getAll();
	}
	
	public void setAll(String nome, String email, int rm, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.rm = rm;
		this.endereco=endereco;
	}

}
