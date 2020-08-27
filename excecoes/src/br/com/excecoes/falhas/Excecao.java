package br.com.excecoes.falhas;

public class Excecao {

	public static String tratarExcecao(Exception e) {
		if (e instanceof NumberFormatException) {
			return "Erro na convers�o";
		}else if (e instanceof NullPointerException) {
			return "Objeto nulo";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Exce��o n�o tratada";
		}
	}
}
