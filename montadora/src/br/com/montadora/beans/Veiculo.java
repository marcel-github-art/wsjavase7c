package br.com.montadora.beans;

import java.util.List;

public class Veiculo {
	private String modelo;
	private int qtdePortas;
	private int ano;
	private List<Acessorio> acessorios;
	
	public String getAll() {
		String strAcessorios="";
		for (Acessorio obj : acessorios) {
			strAcessorios+=obj.getAll() + "\n"; 
		}
		return 
				"Modelo......: " + modelo + "\n" +
				"Portas......: " + qtdePortas + "\n" + 
				"Ano.........: " + ano + "\n" + 
				"Acessorios..: " + acessorios.size() + "\n" + 
				strAcessorios; 

	}
	
	public void setAll(String modelo, int qtdePortas, int ano, List<Acessorio> acessorios) {
		this.modelo = modelo;
		this.qtdePortas = qtdePortas;
		this.ano = ano;
		this.acessorios = acessorios;
	}
	public Veiculo() {
		super();
	}
	public Veiculo(String modelo, int qtdePortas, int ano, List<Acessorio> acessorios) {
		super();
		this.modelo = modelo;
		this.qtdePortas = qtdePortas;
		this.ano = ano;
		this.acessorios = acessorios;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQtdePortas() {
		return qtdePortas;
	}
	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<Acessorio> getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

}
