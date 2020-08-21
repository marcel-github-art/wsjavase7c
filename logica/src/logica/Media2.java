package logica;
import javax.swing.JOptionPane;

class Media2{

public static void main(String args[]){
//Parse: conversão entre tipos incompatíveis (String para número)
//Cast: conversão entre tipos compatíveis (números)
String aluno = JOptionPane.showInputDialog("Digite o seu nome");

float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));

float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));

float media =  (float) (nota1 * 0.4 + nota2 * 0.6);

JOptionPane.showMessageDialog(null, "Media: " + media);


}

}