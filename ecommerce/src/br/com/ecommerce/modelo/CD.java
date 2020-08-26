package br.com.ecommerce.modelo;

import br.com.ecommerce.interfaces.PadraoProduto;

public class CD extends Produto implements PadraoProduto{

	private String artista;
	private int qtdeFaixas;
	private String gravadora;

	public float getImposto() {
		return getValorVenda() * (float) 0.1;
	}
	
	/*
	 * Polimorfismo do tipo Overriding - Sobrescrita (quando os métodos estão
	 * em classes diferentes)
	 */
	public String getAll() {
		return
				super.getAll() + "\n" +
				artista  + "\n" + 
				qtdeFaixas  + "\n" + 
				gravadora;
	}
	public void setAll(int id, String descricao, int qtde, float valorCompra, float valorVenda, String artista, int qtdeFaixas,
			String gravadora) {
		super.setAll(id, descricao, qtde, valorCompra, valorVenda);
		this.artista = artista;
		this.qtdeFaixas = qtdeFaixas;
		this.gravadora = gravadora;
	}
	/*
	 * Polimorfimo do tipo Overload-sobrecarga (quando os métodos estão na mesma classe)
	 */
	public CD() {
		super();
	}
	public CD(int id, String descricao, int qtde, float valorCompra, float valorVenda, String artista, int qtdeFaixas,
			String gravadora) {
		super(id, descricao, qtde, valorCompra, valorVenda);
		this.artista = artista;
		this.qtdeFaixas = qtdeFaixas;
		this.gravadora = gravadora;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getQtdeFaixas() {
		return qtdeFaixas;
	}
	public void setQtdeFaixas(int qtdeFaixas) {
		this.qtdeFaixas = qtdeFaixas;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	@Override
	public String verificarEstoque() {
		if (getQtde()<5) {
			return "Estoque Baixo";
		}else {
			return "Estoque Normal";
		}
	}


}
