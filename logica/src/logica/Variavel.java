package logica;
import java.util.Scanner;

class Variavel{
public static void main(String args[]){

	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite o nome:" );
	String nome = teclado.next();
	
	System.out.println("Digite sua idade: ");
	int idade= teclado.nextInt();

	System.out.println("Digite sua altura: ");
	double altura = teclado.nextDouble();
	
	System.out.println("Digite o seu peso: ") ;
	double peso = teclado.nextDouble();
	double imc = peso / (altura * altura);
	
	System.out.println("Nome do Cliente.: " + nome);
	System.out.println("Idade...........: " + idade + " anos.");
	System.out.println("Altura..........: " + altura + " mts.");
	System.out.println("Peso............: " + peso + " kgs.");
	
	System.out.println("Seu imc eh......: " + imc);

	
} // fecha o metodo main

} // fecha a classe
//System.out.println("Nome: " + nome + "\nIdade:" + idade);