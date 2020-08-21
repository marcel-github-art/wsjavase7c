package decisao;

import java.util.Scanner;
class ExercicioDecisao{


public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite o nome do Produto");
	String produto = teclado.next().toUpperCase();

	System.out.println("Digite o tipo do Produto");
	String tipo = teclado.next().toUpperCase();

	System.out.println("Digite o valor do Produto");
	float valor = teclado.nextFloat();

	System.out.println("Digite a qtde do Produto");
	int qtde = teclado.nextInt();

	if (tipo.equals("ALIMENTICIO")){
		valor = valor * (float) 0.95;
	}else if (tipo.equals("TECNOLOGIA")){
		valor = valor * (float) 1.08;
	}

	float total = valor * qtde;

	if (qtde>15){
		System.out.println("Digite um desconto");
		float desconto = teclado.nextFloat();
		total = total - total * (desconto/100);
	}

	System.out.println("O total eh: " + total);



}

}