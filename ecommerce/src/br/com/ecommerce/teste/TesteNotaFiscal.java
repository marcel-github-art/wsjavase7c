package br.com.ecommerce.teste;

import br.com.ecommerce.atalhos.Magica;
import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Colaborador;
import br.com.ecommerce.modelo.NotaFiscal;
import br.com.ecommerce.modelo.Produto;

public class TesteNotaFiscal {

	public static void main(String[] args) {
		Produto produto = new Produto(
				Magica.i("ID"),
				Magica.s("Descricao"),
				Magica.i("QTDE"),
				Magica.f("Valor Compra"),
				Magica.f("Valor Venda")
				);
		Cliente cliente = new Cliente();
		cliente.setAll(Magica.i("ID Cliente"), Magica.s("Cliente"), Magica.s("CPF"));
		Colaborador colaborador = new Colaborador();
		colaborador.setNome(Magica.s("Nome"));
		colaborador.setEmail(Magica.s("Email"));
		colaborador.setFone(Magica.s("Fone"));
		NotaFiscal nf = new NotaFiscal();
		nf.setCliente(cliente);
		nf.setProduto(produto);
		nf.setVendedor(colaborador);
		nf.setData(Magica.s("Data Nota Fiscal"));
		nf.setNumero(Magica.i("Numero NF"));
		System.out.println(nf.getAll());
		System.out.println(nf.getVendedor().getNome());
		System.out.println(nf.getProduto().getValorVenda());
		System.out.println(nf.getCliente().getCpf());
		
	}

}
