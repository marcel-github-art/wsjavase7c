package repeticao;

import javax.swing.JOptionPane;

class DesafioDo{

public static void main (String args[]){

int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
int chute = 0;
int qtde = 0;
do{
	chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o numero"));
	//qtde=qtde+1;
	qtde++;
	// qtde+=1;
	if (chute>numero){
		JOptionPane.showMessageDialog(null, "Chutando alto...");
	}else if (chute<numero){
		JOptionPane.showMessageDialog(null, "Chutando baixo...");
	}
}while(numero!=chute);
JOptionPane.showMessageDialog(null, "Parabéns voce acertou com " + qtde + " tentativas.");
}

}