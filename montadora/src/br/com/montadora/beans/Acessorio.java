package br.com.montadora.beans;

public class Acessorio {
	private String descricao;
	private float valor;
	public String getAll() {
		return "Descrição: " + descricao + "\nValor: " + valor;
	}
	public void setAll(String descricao, float valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	public Acessorio() {
		super();
	}
	public Acessorio(String descricao, float valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

}
