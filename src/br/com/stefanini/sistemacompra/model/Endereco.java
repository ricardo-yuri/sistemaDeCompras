package br.com.stefanini.sistemacompra.model;

public class Endereco {

	private Integer idEndereco;
	private String logradouro;
	private String localidade;
	private Cliente cliente;

	public Endereco() {

	}

	public Endereco(Integer idEndereco, String logradouro, String localidade, Cliente cliente) {
		super();
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.localidade = localidade;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", localidade=" + localidade
				+ ", cliente=" + cliente + "]";
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
