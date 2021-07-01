package br.com.stefanini.sistemacompra.model;

public class Cliente {

	private Integer idCliente;
	private String nome;
	private String email;
	private Endereco endereco;

	public Cliente() {

	}

	public Cliente(Integer idCliente, String nome, String email, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + "]";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
