package repeticao;

import javax.swing.JOptionPane;

class ExemploDo{

public static void main(String args[]){

String colaborador="";
float salario=0;
String resposta="";

do{
	colaborador = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
	salario= Float.parseFloat(JOptionPane.showInputDialog("Seu salário"));
	System.out.println("Desconto do FGTS: " + (salario*0.08));
	resposta = JOptionPane.showInputDialog
				("Digite <S> para continuar").toUpperCase();
}while(resposta.equals("S"));

}

}