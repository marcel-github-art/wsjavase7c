package br.com.ecommerce.teste;

import javax.swing.JOptionPane;

import br.com.ecommerce.atalhos.Magica;
import br.com.ecommerce.modelo.CD;
import br.com.ecommerce.modelo.Livro;
import br.com.ecommerce.modelo.Produto;

public class TesteProdutoHeranca {
	public static void main(String[] args) {
		
		char resposta=0;
		Produto produto=null;
		do {
			resposta = Magica.s("Digite \n<C> para CD \nou qualquer outro caracter para Livro").charAt(0);
			if (resposta == 'C') {
				produto = new CD(
						Magica.i("ID"),
						Magica.s("Descricao"),
						Magica.i("QTDE"),
						Magica.f("Valor Compra"),
						Magica.f("Valor Venda"),
						Magica.s("Artista"),
						Magica.i("Faixas"),
						Magica.s("Gravadora")
						);
			}else {
				produto = new Livro(
						Magica.i("ID"),
						Magica.s("Descricao"),
						Magica.i("QTDE"),
						Magica.f("Valor Compra"),
						Magica.f("Valor Venda"),
						Magica.s("Autor"),
						Magica.s("Editora")
						);
			}
			System.out.println(produto.getAll());
			System.out.println(produto.getImposto());
			
		}while(
				JOptionPane.showConfirmDialog(
						null,
						"Continuar?",
						"Titulo",
						JOptionPane.YES_NO_OPTION)==0
				);
	}
}
