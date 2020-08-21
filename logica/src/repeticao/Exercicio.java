package repeticao;

import javax.swing.JOptionPane;
class Exercicio{
public static void main(String args[]){
String cargo="";
float salario=0;
String dpto="";
char resposta=0;
float totalTI=0;
float totalDP=0;
float totalRH=0;
do{
	cargo = JOptionPane.showInputDialog("Cargo").toUpperCase();
	salario = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
	dpto = JOptionPane.showInputDialog("Dpto").toUpperCase();
	if (dpto.equals("TI")){
		totalTI+=salario;
	}else if (dpto.equals("DP")){
		totalDP+=salario;
	}else if (dpto.equals("RH")){
		totalRH+=salario;
	}
	resposta = JOptionPane.showInputDialog("Digite <S>").toUpperCase().charAt(0);
}while(resposta=='S');
JOptionPane.showMessageDialog
	(null, "TI: " + totalTI + "\nDP: " + totalDP + "\nRH:" + totalRH);
}


}