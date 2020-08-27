package br.com.colecoes.beans;

public class Cargo implements Comparable<Cargo>{

	private String nome;
	private String nivel;
	private float salario;
	
	// Ordenem os objetos por nome do cargo
	public int compareTo(Cargo outro) {
		return -nome.compareTo(outro.nome);
		//return outro.nome.compareTo(nome);
	}
	
	
	public String getAll() {
		return nome + "\n" + nivel + "\n" + salario;
	}
	public void setAll(String nome, String nivel, float salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	public Cargo() {
		super();
	}
	public Cargo(String nome, String nivel, float salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	/*@Override
	public int compareTo(Cargo outro) {
		if (this.salario>outro.salario) {
			return 1;
		}else if (this.salario<outro.salario) {
			return -1;
		}
		return 0;
	}*/
	
}
