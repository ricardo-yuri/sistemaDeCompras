package br.com.stefanini.sistemacompra.model;

public class ItemProduto {

	private Integer idItemProduto;
	private Integer quantidade;
	private Produto produto;
	private Double valorTotal;

	public ItemProduto() {

	}

	public ItemProduto(Integer idItemProduto, Integer quantidade, Produto produto, Double valorTotal) {
		super();
		this.idItemProduto = idItemProduto;
		this.quantidade = quantidade;
		this.produto = produto;
		this.valorTotal = valorTotal;
	}

	public Integer getIdItemProduto() {
		return idItemProduto;
	}

	public void setIdItemProduto(Integer idItemProduto) {
		this.idItemProduto = idItemProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
