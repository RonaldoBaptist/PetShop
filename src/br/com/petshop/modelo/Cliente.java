package br.com.petshop.modelo;

/**
 * @author Ronaldo
 * 
 * @since 29/11/2015
 * 
 *        version 1.0
 * 
 */
public class Cliente {
	private int idCliente;
	private String nome;
	private String cpf;
	private String enderešo;
	private String telefone;
	private String email;
	private String servišo;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getServišo() {
		return servišo;
	}

	public void setServišo(String servišo) {
		this.servišo = servišo;
	}

}
