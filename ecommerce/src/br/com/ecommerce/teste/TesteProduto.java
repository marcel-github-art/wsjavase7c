package br.com.ecommerce.teste;

import javax.swing.JOptionPane;

import br.com.ecommerce.atalhos.Magica;
import br.com.ecommerce.modelo.Produto;

public class TesteProduto {
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toLowerCase();
	}
	public static void main(String[] args) {
		Produto objeto = new Produto();
		objeto.setId(Magica.i("ID"));
		objeto.setDescricao(s("Descrição"));
		objeto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Qtde")));
		objeto.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")));
		objeto.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")));
		
		System.out.println(objeto.getId());
		System.out.println(objeto.getDescricao());
		System.out.println(objeto.getQtde());
		System.out.println(objeto.getValorCompra());
		System.out.println(objeto.getValorVenda());
		
	}

}
