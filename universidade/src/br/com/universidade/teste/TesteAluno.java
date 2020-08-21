package br.com.universidade.teste;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;

public class TesteAluno {

public static void main(String[] args) {
	//String nome = "teste"; // criando uma variavel
	//Scanner teclado = new Scanner(); // instanciando o objeto
	//Aluno objeto2; // criando o objeto

	// metodo construtor SEMPRE tem o mesmo nome da classe
	Aluno objeto = new Aluno(); // instanciando o objeto
	objeto.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
	objeto.setNome(JOptionPane.showInputDialog("Digite o nome"));
	objeto.setEmail(JOptionPane.showInputDialog("Email:" ));
	System.out.println(objeto.getNome());
	System.out.println(objeto.getEmail());
	System.out.println(objeto.getRm());
	
	
}

}
