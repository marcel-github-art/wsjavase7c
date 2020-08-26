package br.com.ecommerce_heranca.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce_heranca.atalhos.Magica;
import br.com.ecommerce_heranca.beans.Cliente;
import br.com.ecommerce_heranca.beans.ClientePF;
import br.com.ecommerce_heranca.beans.ClientePJ;

public class ImplementarCliente3 {

	public static void main(String[] args) {

		Cliente cli = new Cliente();

		do {
			char resp = Magica.s("Digite:\n<1> Cadastrar PF\n<2> Cadastrar PJ").charAt(0);
			if (resp=='1') {
				cli = new ClientePF(
						Magica.i("ID"),
						Magica.s("Email"),
						Magica.s("Telefone"),
						Magica.s("Nome"),
						Magica.s("CPF"),
						Magica.s("RG"),
						Magica.s("Nascimento")
						);		
			}else if (resp=='2') {
				cli = new ClientePJ(
						Magica.i("ID"),
						Magica.s("Email"),
						Magica.s("Telefone"),
						Magica.s("Razao Social"),
						Magica.s("CNPJ"),
						Magica.s("IE"),
						Magica.s("Contato")
						);
			}else {
				System.out.println("Digite somente 1 ou 2");
			}
			System.out.println(cli.getAll());

		}while(JOptionPane.showConfirmDialog(
				null,
				"Deseja continuar?",
				"Pergunta",
				JOptionPane.YES_NO_OPTION
				)==0);

	}
}
