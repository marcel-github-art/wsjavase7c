package br.com.montadora.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.montadora.atalhos.Magica;
import br.com.montadora.beans.Acessorio;
import br.com.montadora.beans.Veiculo;
import br.com.montadora.falhas.Excecao;

public class TesteVeiculo {

	public static void main(String[] args) {
		try{
			List<Veiculo> veiculos = new ArrayList<Veiculo>();
			List<Acessorio> acessorios = new ArrayList<Acessorio>();
			Veiculo veiculo = null;
			int cont =0;
			do {
				cont=0;
				acessorios = new ArrayList<Acessorio>();
				veiculo=new Veiculo(
						Magica.s("Modelo"),
						Magica.i("Portas"),
						Magica.i("Ano"),
						acessorios
						);
				while(Magica.b("Lançar Acessorio?")==true && cont<4) {
					cont++;
					acessorios.add(new Acessorio(
							Magica.s("Descrição"), 
							Magica.f("Valor")
							));
				}
				veiculos.add(veiculo);
			}while(Magica.b("Continuar?")==true);
			for (Veiculo v : veiculos) {
				System.out.println(v.getAll());
			}
		}catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}
