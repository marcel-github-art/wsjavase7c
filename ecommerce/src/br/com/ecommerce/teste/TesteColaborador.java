package br.com.ecommerce.teste;

import br.com.ecommerce.atalhos.Magica;
import br.com.ecommerce.modelo.Colaborador;

public class TesteColaborador {
	public static void main(String[] args) {
		Colaborador funcionario = new Colaborador(
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("Email").toLowerCase(),
				Magica.s("Fone"),
				Magica.s("Nascimento"),
				Magica.s("Cargo"),
				Magica.f("Salario")
				);
		System.out.println(funcionario.getAll());

	}

}
