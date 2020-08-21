package logica;

import java.util.Scanner;

class Lista1Exercicio5{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o ano do seu nascimento:");
int anoNascimento = teclado.nextInt();

System.out.println("Digite o ano atual: ");
int anoAtual = teclado.nextInt();

System.out.println("A idade eh....: " + (anoAtual - anoNascimento));
System.out.println("Em 2050 terah.: " + (2050 - anoNascimento));

//Qtos tipos de conversões?
// Parse => utiliza para dados imcompatíveis (exemplo: String => int)
// Utilizamos as classes Wrapper´s (são classes para apoio do tipo Primitivo)
// int num = Integer.parseInt("7");
// short num = Short.parseShort("8");
// double num = Double.parseDouble("7");

// Conversões para dados compatíveis 
// Cast conversão explicita => vc tem um dado maior e
// e quer colocar em uma variável menor (exemplo: long => byte)
// byte num = (byte) varLong;

// Conversão implicita => vc tem um dado menor e 
// quer colocar em uma variável maior (exemplo: byte => long)
// long num = varByte;

}

}