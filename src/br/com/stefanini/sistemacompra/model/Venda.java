package br.com.stefanini.sistemacompra.model;

public class Venda {

	private Integer idVenda = 0;
	private Double valorTotal;
	private Integer idCesta;

	public Venda() {
		idVenda++;

	}

	public Venda(Integer idVenda, Double valorTotal, Integer idCesta) {
		super();
		this.idVenda = idVenda;
		this.valorTotal = valorTotal;
		this.idCesta = idCesta;
	}

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", valorTotal=" + valorTotal + ", idCesta=" + idCesta + "]";
	}

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getIdCesta() {
		return idCesta;
	}

	public void setIdCesta(Integer idCesta) {
		this.idCesta = idCesta;
	}

}
