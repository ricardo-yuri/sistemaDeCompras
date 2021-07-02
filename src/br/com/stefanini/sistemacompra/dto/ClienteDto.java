package br.com.stefanini.sistemacompra.dto;

public class ClienteDto {

	private Integer idCliente;
	private String nome;
	private String email;
	private Integer idEndereco;
	private String logradouro;
	private String cep;
	
	public ClienteDto() {
		
	}
	
	public ClienteDto(Integer idCliente, String nome, String email, Integer idEndereco, String logradouro, String cep) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "ClienteDto [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", idEndereco="
				+ idEndereco + ", logradouro=" + logradouro + ", cep=" + cep + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
}
