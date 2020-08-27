package br.com.excecoes.teste;

import br.com.excecoes.falhas.Excecao;

public class TesteExcecoes {

	public static void main(String[] args) {
		/*
		 * Exce��es => situa��es n�o controladas pelo programador.
		 * Existem dois tipos:
		 * Checked�s: s�o exce��es checadas AC (Antes da Compila��o)
		 * Unchecked�s: s�o exce��es checadas DC (Depois da Compila��o)
		 */
		try { // um bloco para que Java observe as excecoes
			int numero = Integer.parseInt("1");
			System.out.println(numero);
			
			String email = "";
			System.out.println(email.length());
			
			int numeros[]= new int[2];
			numeros[0] = 150;
			numeros[1] = 89;
			numeros[2] = 5;
			
		}catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}finally {
			// comando para fechar a conexao com o banco de dados
			System.out.println("At� logo....");
		}
	}

}
