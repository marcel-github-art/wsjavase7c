package decisao;

import javax.swing.JOptionPane;

class Votacao{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Digite o nome");
short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));

if (idade<16){
	System.out.println(nome + " você não pode votar!");
}else if (idade>=18 && idade<70){
	System.out.println(nome + " você é obrigado a votar!");
}else{
	System.out.println(nome + " o voto pra você é facultativo!");
}

}


}