package br.com.colecoes.teste;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.atalhos.Magica;
import br.com.colecoes.beans.Cargo;
import br.com.colecoes.falhas.Excecao;

public class TesteMap {

	public static void main(String[] args) {
		try {
			Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();
			Cargo objeto = null;
			int id=0;
			do {
				objeto = new Cargo(
						Magica.s("Nome do cargo"),
						Magica.s("Nível do cargo"),
						Magica.f("Salario")
						);
				id++;
				lista.put(id, objeto);
			}while(Magica.b("Deseja continuar?")==true);

			System.out.println(lista.keySet());
			System.out.println(lista.values());
			System.out.println("\nDADOS DO FOR\n");
			for (Cargo obj : lista.values()) {
				System.out.println(obj.getAll());
				System.out.println("==========================");
			}//fechando o for
		} // fechando o try
		catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		} // fechando o catch

	} // fecha o método  
} // fecha a classe
