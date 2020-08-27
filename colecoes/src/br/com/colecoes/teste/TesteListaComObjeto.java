package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaComObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "JR", 10000));
		lista.add(new Cargo("DEV", "PL", 17000));
		lista.add(new Cargo("ANALISTA","JR",12000));
		lista.add(new Cargo("ESTAGIARIO", "SR", 3500));
		System.out.println(lista.get(1).getAll());
		System.out.println("Percorrer com o FOR");
		Collections.sort(lista);
		for (Cargo obj : lista) {
			System.out.println(obj.getAll());
			System.out.println("===========================");
		}
		
	}

}
