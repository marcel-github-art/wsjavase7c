package br.com.ecommerce_heranca.beans;

public class ClientePJ extends Cliente{

	private String razaoSocial;
	private String cnpj;
	private String ie;
	private String contato;
	
	public String getAll() {
		return 
				super.getAll() + "\n" +
				razaoSocial + "\n" + 
				cnpj + "\n" + 
				ie + "\n" + 
				contato;
	}
	
	public void setAll(int id, String email, String telefone, String razaoSocial, String cnpj, String ie,
			String contato) {
		super.setAll(id, email, telefone);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
	public ClientePJ() {
		super();
	}
	public ClientePJ(int id, String email, String telefone, String razaoSocial, String cnpj, String ie,
			String contato) {
		super(id, email, telefone);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.ie = ie;
		this.contato = contato;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
}
