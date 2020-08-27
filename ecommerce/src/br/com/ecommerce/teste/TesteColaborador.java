package br.com.ecommerce.teste;

import br.com.ecommerce.atalhos.Magica;
import br.com.ecommerce.modelo.Colaborador;

public class TesteColaborador {
	public static void main(String[] args) {
		try {
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
		}catch(NumberFormatException e) {
			System.out.println("Número inválido - Falha na conversão");
		}catch(NullPointerException e) {
			System.out.println("Objeto está nulo");
		}catch(Exception e) {
			System.out.println("Ocorreu um erro inesperado");
		}
		finally {
			// comando para fechar a conexao com o banco de dados
			System.out.println("Até logo....");
		}
	}

}
