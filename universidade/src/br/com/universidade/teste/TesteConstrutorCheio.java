package br.com.universidade.teste;

import javax.swing.JOptionPane;

import br.com.universidade.atalhos.Magica;
import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;

public class TesteConstrutorCheio {

	public static void main(String[] args) {
		Endereco objEndereco = new Endereco();
		
		Aluno obj = new Aluno(
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("Email").toLowerCase(),
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				objEndereco
				);
		
		objEndereco.setAll(
				Magica.s("Logradouro"), 
				Magica.s("Numero"), 
				Magica.s("Complemento"), 
				Magica.s("Bairro"), 
				Magica.s("Cidade"), 
				Magica.s("UF"), 
				Magica.s("CEP")
				);
		
		// PREENCHEENDO PELO CONSTRUTOR CHEIO
		Professor prof = new Professor(
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("Admissao"),
				objEndereco
				);
		
		//OU pelo setAll()
		
		Professor prof2 = new Professor();
		prof2.setAll(
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("Admissao"),
				objEndereco
				);
		
		// OU pelo setter individual
		
		Professor prof3 = new Professor();
		prof3.setEndereco(objEndereco);
		prof3.setNome(Magica.s("Nome"));
		prof3.setId(Magica.i("ID"));
		prof3.setAdmissao(Magica.s("Admissao"));
		
		System.out.println(obj.getAll());
		
		System.out.println(prof.getAll());
		System.out.println(prof2.getAll());
		System.out.println(prof3.getAll());
		
		//System.out.println(obj.getEndereco().getBairro());
		
	}

}
