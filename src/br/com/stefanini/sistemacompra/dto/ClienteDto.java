package br.com.stefanini.sistemacompra.dto;

public class ClienteDto { // response

	private Integer idClienteDto;
	private String nome;
	private String email;
	private String logradouro;
	private String localidade;

	public ClienteDto() {

	}

	public ClienteDto(Integer idClienteDto, String nome, String email, String logradouro, String localidade) {
		super();
		this.idClienteDto = idClienteDto;
		this.nome = nome;
		this.email = email;
		this.logradouro = logradouro;
		this.localidade = localidade;
	}

	@Override
	public String toString() {
		return "ClienteDto [idClienteDto=" + idClienteDto + ", nome=" + nome + ", email=" + email + ", logradouro="
				+ logradouro + ", localidade=" + localidade + "]";
	}

	public Integer getIdClienteDto() {
		return idClienteDto;
	}

	public void setIdClienteDto(Integer idClienteDto) {
		this.idClienteDto = idClienteDto;
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

}
