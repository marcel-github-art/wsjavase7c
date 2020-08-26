package br.com.ecommerce_heranca.implementacao;

import br.com.ecommerce_heranca.atalhos.Magica;
import br.com.ecommerce_heranca.beans.ClientePF;
import br.com.ecommerce_heranca.beans.ClientePJ;

public class ImplementarCliente {

	public static void main(String[] args) {
		char resp = Magica.s("Digite:\n<1> Cadastrar PF\n<2> Cadastrar PJ").charAt(0);
		if (resp=='1') {
			ClientePF pf = new ClientePF(
					Magica.i("ID"),
					Magica.s("Email"),
					Magica.s("Telefone"),
					Magica.s("Nome"),
					Magica.s("CPF"),
					Magica.s("RG"),
					Magica.s("Nascimento")
					);
			System.out.println(pf.getAll());
			
		}else if (resp=='2') {
			ClientePJ pj = new ClientePJ(
					Magica.i("ID"),
					Magica.s("Email"),
					Magica.s("Telefone"),
					Magica.s("Razao Social"),
					Magica.s("CNPJ"),
					Magica.s("IE"),
					Magica.s("Contato")
					);
			System.out.println(pj.getAll());
		}else {
			System.out.println("Digite somente 1 ou 2");
		}
		
		
	}

}
