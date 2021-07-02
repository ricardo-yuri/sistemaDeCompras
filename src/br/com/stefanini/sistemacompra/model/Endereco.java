package br.com.stefanini.sistemacompra.model;

public class Endereco {

	private Integer idEndereco;
	private String logradouro;
	private String cep;
	private Cliente cliente;

	public Endereco() {
		
	}
	
	public Endereco(Integer idEndereco, String logradouro, String cep, Cliente cliente) {
		super();
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.cep = cep;
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", cep=" + cep + ", cliente="
				+ cliente + "]";
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
