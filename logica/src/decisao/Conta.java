package decisao;

import javax.swing.JOptionPane;
class Conta{

public static void main(String args[]){
float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));
if (saldo<0){
	System.out.println("Sua conta está negativa!");
}
// && => and (e) - obriga que as duas condições sejam verdadeiras
// || => or (ou) - quando uma das condições tem que ser verdadeira
// != => não é igual
if (saldo>=0 && saldo<1000){
	System.out.println("Sua conta é normal");
}
if (saldo>=1000){
	System.out.println("Estah sobrando dinheiro");
}
System.out.println("Até logo!");
}
}