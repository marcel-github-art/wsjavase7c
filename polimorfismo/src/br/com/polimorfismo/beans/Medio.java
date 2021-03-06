package br.com.polimorfismo.beans;

import br.com.polimorfismo.interfaces.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{
	private String tipo="";

	public String getAll() {
		return super.getAll() + "\n" + tipo;
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public Medio() {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500);
		
	}

}
