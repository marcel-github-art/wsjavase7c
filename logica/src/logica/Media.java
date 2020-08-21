package logica;
import java.util.Scanner;

class Media{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite a primeira nota:");
float nota1 = teclado.nextFloat();

System.out.println("Digite a segunda nota:");
float nota2 = teclado.nextFloat();
// Cast é uma conversão explicita, de um dado maior para um dado menor
float media = nota1 * (float) 0.4 + nota2 * (float) 0.6;
System.out.println("Media: " + media);


}

}