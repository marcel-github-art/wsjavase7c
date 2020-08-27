package br.com.polimorfismo.beans;

import br.com.polimorfismo.interfaces.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao{
	private boolean planoEstendido;

	public String getAll() {
		return super.getAll() + "\n" + planoEstendido;
	}
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	@Override
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 600);	
	}
}
