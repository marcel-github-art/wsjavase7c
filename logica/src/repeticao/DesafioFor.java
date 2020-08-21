package repeticao;

import java.util.Scanner;
class DesafioFor{

public static void main(String args[]){

Scanner tec = new Scanner(System.in);
System.out.println("Digite um numero");
int num = tec.nextInt();

for(int cont=1;cont<11;cont++){
	System.out.println(num + " x " + cont + " = " + (num*cont));
}

}


}