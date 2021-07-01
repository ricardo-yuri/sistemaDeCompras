package br.com.stefanini.sistemacompra.model;

public class Produto {

	private Integer idProduto;
	private String nome;
	private Double valor;

	public Produto() {

	}

	public Produto(Integer idProduto, String nome, Double valor) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", valor=" + valor + "]";
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
