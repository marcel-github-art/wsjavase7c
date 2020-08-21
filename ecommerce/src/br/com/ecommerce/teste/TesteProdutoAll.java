package br.com.ecommerce.teste;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProdutoAll {
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static void main(String[] args) {
		Produto p = new Produto();
		p.setAll(
				i("ID"), 
				s("Descrição"), 
				i("Qtde"), 
				Float.parseFloat(JOptionPane.showInputDialog("ValorCompra")), 
				Float.parseFloat(JOptionPane.showInputDialog("ValorVenda"))
				);
		System.out.println(p.getAll());
	}

}
