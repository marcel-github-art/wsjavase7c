package br.com.polimorfismo.implementacao;

import javax.swing.JOptionPane;

import br.com.polimorfismo.atalhos.Magica;
import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;

public class TesteFormacao {

	public static void main(String[] args) {
		Formacao formacao = null;
		char resp = JOptionPane.showInputDialog
				("Digite:\n<B> para Bacharelado\n<T> para Tecnologo\n"
						+ "Qualquer outro caracter para Medio").toUpperCase().charAt(0);
		if (resp=='B') {
			formacao = new Bacharelado(
					Magica.s("Descricao"),
					Magica.i("Periodo"),
					0,
					0,
					Magica.s("Projeto Conclusao"),
					Magica.i("Carga Horária do Estágio")
					);
		}else if (resp=='T') {
			formacao = new Tecnologo(
					Magica.s("Descricao"),
					Magica.i("Periodo"),
					0,
					0,
					Magica.b("É plano estendido?")
					);
		}else {
			formacao = new Medio(
					Magica.s("Descricao"),
					Magica.i("Periodo"),
					0,
					0,
					Magica.s("Tipo")
					);
		}
		formacao.definirDuracao();
		formacao.calcularMensalidade(Magica.f("Fator"));
		System.out.println(formacao.getAll());
		
	}

}
