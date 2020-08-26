package br.com.ecommerce.modelo;

public class NotaFiscal {
	private Produto produto;
	private Colaborador vendedor;
	private Cliente cliente;
	private String data;
	private int numero;

	public String getAll() {
		return
				produto.getAll() + "\n" +
				vendedor.getBasico() + "\n" + 
				cliente.getAll() + "\n" + 
				data + "\n" + 
				numero;
	}

	public void setAll(Produto produto, Colaborador vendedor, Cliente cliente,
			String data, int numero) {
		this.produto = produto;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.data = data;
		this.numero = numero;
	}

	public NotaFiscal() {
		super();
	}
	public NotaFiscal(Produto produto, Colaborador vendedor, Cliente cliente, String data, int numero) {
		super();
		this.produto = produto;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.data = data;
		this.numero = numero;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Colaborador getVendedor() {
		return vendedor;
	}
	public void setVendedor(Colaborador vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
