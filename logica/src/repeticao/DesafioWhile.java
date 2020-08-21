package repeticao;

import java.util.Scanner;

class DesafioWhile{

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);
System.out.println("Digite dia");
int dia = teclado.nextInt();
System.out.println("Digite mes");
int mes = teclado.nextInt();
System.out.println("Digite ano");
int ano = teclado.nextInt();

while (dia<1 || dia>31){
	System.out.println("Digite o dia novamente");
	dia = teclado.nextInt();
}

while (mes<1 || mes>12){
	System.out.println("Digite o mes novamente");
	mes = teclado.nextInt();
}

while (ano<1920 || ano>2002){
	System.out.println("Digite o ano novamente");
	ano = teclado.nextInt();
}

System.out.println("Data: " + dia + "/" + mes + "/" + ano);


}


}