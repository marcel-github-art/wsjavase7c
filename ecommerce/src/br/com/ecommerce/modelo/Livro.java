package br.com.ecommerce.modelo;

import br.com.ecommerce.interfaces.PadraoProduto;

public class Livro extends Produto implements PadraoProduto{
	private String autor;
	private String editora;
	
	public String getAll() {
		return super.getAll() + "\n" + autor + "\n" + editora;
	}
	
	public void setAll(int id, String descricao, int qtde, float valorCompra, float valorVenda, String autor,
			String editora) {
		super.setAll(id, descricao, qtde, valorCompra, valorVenda);
		this.autor = autor;
		this.editora = editora;
	}
	
	public Livro() {
		super();
	}
	public Livro(int id, String descricao, int qtde, float valorCompra, float valorVenda, String autor,
			String editora) {
		super(id, descricao, qtde, valorCompra, valorVenda);
		this.autor = autor;
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

	
	public float getImposto() {
		return getValorVenda() * (float) 0.05;
	}

	
	public String verificarEstoque() {
		if (getQtde()<2) {
			return "Estoque Baixo";
		}else {
			return "Estoque Normal";
		}
		
	}

}
