package decisao;

import javax.swing.JOptionPane;
class Notas{
public static void main (String args[]){
String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
float media = (nota1+nota2)/2;
if (media>=5){
	System.out.println("Parabéns " + nome + " voce estah aprovado!");
}
if (media<5 && media>=3){
	System.out.println(nome + " voce ainda tem uma chance no Exame");
}
if (media<3){
	System.out.println(nome + " infelizmente voce reprovou");
}
}
}