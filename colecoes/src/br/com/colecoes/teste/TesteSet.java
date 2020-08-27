package br.com.colecoes.teste;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("INFRA");
		lista.add("ESTAGIARIO");
		System.out.println(lista);
		//Collections.sort(lista);
		//System.out.println(lista.get(1));
		System.out.println(lista.contains("DBA"));

	}

}
