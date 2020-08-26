package br.com.ecommerce_heranca.beans;

public class Cliente {
	private int id;
	private String email;
	private String telefone;

	public String getAll() {return id + "\n" + email + "\n" + telefone;}
	
	public void setAll(int id, String email, String telefone) {
		this.id = id;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id, String email, String telefone) {
		super();
		this.id = id;
		this.email = email;
		this.telefone = telefone;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
