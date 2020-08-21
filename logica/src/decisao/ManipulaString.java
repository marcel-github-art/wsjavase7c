package decisao;

import javax.swing.JOptionPane;

class ManipulaString{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Digite seu nome");
System.out.println("Original: " + nome);
System.out.println("Maiuscula: " + nome.toUpperCase());
System.out.println("Minuscula: " + nome.toLowerCase());
System.out.println("Qtde Caracteres: " + nome.length());
System.out.println("Comparação: " + nome.equals("XPTO"));
System.out.println("Comp. Ignorando Caixa: "+nome.equalsIgnoreCase("XPTO"));
System.out.println("3 primeiros caracteres: " + nome.substring(0,3));
System.out.println("Da posicao 2 em diante: " + nome.substring(2));
System.out.println("1º metade do nome: " + nome.substring(0,nome.length()/2));
System.out.println("2º metade do nome: " + nome.substring(nome.length()/2));
System.out.println("Posicao da letra A: " + nome.indexOf("A")); 

}
}