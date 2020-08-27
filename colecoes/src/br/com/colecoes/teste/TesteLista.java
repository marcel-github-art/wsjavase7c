package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteLista {
	public static void main(String[] args) {
		/*
		 * Collection Framework
		 */
		List<String> lista = new ArrayList<String>();
		lista.add("DBA");
		lista.add("JR");
		lista.add("DEV");
		lista.add("PL");
		lista.add("DBA");
		lista.add("PL");
		lista.add("INFRA");
		lista.add("SR");
		//System.out.println(lista);
		//Collections.sort(lista);
		//System.out.println(lista);
		//System.out.println("Exibindo segundo cargo: " + lista.get(1));
		//lista.remove(0);
		//System.out.println("Sem o elemento zero: " + lista);
		// variavel que conta / condição para repeticao / incremento
		String busca = JOptionPane.showInputDialog("Digite o cargo");
		//for(int cont=0;cont<lista.size();cont++) {
		//	if (busca.equals(lista.get(cont))) {
		//		System.out.println("Achou na posição: " + cont);
		//	}
		//	System.out.println("Cargo: "+ (cont+1) + lista.get(cont));
		//}
		
		//Foreach
		for (String x : lista) {
			if (busca.equals(x)) {
				System.out.println("Achou: " + x );
			}
		}
		
		
		
	}

}
