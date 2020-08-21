package decisao;

import javax.swing.JOptionPane;

class VotacaoEncadeada{

public static void main(String args[]){
// acrescentem uma pergunta pro usuario
// 0 - É analfabeto ou 1 Não é analfabeto

String nome = JOptionPane.showInputDialog("Digite o nome");
byte situacao = Byte.parseByte(JOptionPane.showInputDialog("Digite 0 se for analfabeto"));
if (situacao==0){
	System.out.println("É analfabeto, não pode votar");
}else{
	short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));
	if (idade<16){
		System.out.println(nome + " você não pode votar!");
	}else if (idade>=18 && idade<70){
		System.out.println(nome + " você é obrigado a votar!");
	}else{
		System.out.println(nome + " o voto pra você é facultativo!");	
	} // fecha o if da idade
} // fecha o if do analfabeto
} // fecha o método main()
} //fecha a classe