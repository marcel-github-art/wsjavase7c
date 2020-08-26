package br.com.ecommerce.teste;
import br.com.ecommerce.atalhos.Magica;
import br.com.ecommerce.modelo.*;
public class TesteLoucura {

	public static void main(String[] args) {
		
		NotaFiscal nf = new NotaFiscal(
				new Produto(
						Magica.i("id"),
						Magica.s("descricao"),
						Magica.i("qtde"),
						Magica.f("VC"),
						Magica.f("VV")
						),
				new Colaborador(
						0,
						Magica.s("Nome"),
						Magica.s("Email"),
						Magica.s("Fone"),
						"",
						"",
						0
						),
				new Cliente(
						Magica.i("ID"),
						Magica.s("Nome"),
						Magica.s("CPF")
						),
				Magica.s("Data"),
				Magica.i("Numero")
				);
		System.out.println(nf.getAll());
	}

}
