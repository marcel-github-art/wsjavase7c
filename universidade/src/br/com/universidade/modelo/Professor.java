package br.com.universidade.modelo;

/*
 * Modelo/Beans => Design Pattern => DTO
 * 1º Getters e Setter para cada atributo
 * 2º Todos os atributos devem ser privados
 * 3º Toda classe Beans um construtor cheio e outro vazio
 */
public class Professor {
	private int id;
	private String nome;
	private String admissao;
	private Endereco endereco;
	
	public String getAll() {
		return
				id + "\n" +
				nome + "\n" + 
				admissao + "\n" + 
				endereco.getAll(); 
	}
	
	public void setAll(int id, String nome, String admissao, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.admissao = admissao;
		this.endereco = endereco;
	}
	
	public Professor() {
	
	}
	public Professor(int id, String nome, String admissao, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.admissao = admissao;
		this.endereco = endereco;
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
	public String getAdmissao() {
		return admissao;
	}
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
