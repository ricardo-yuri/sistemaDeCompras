package br.com.stefanini.sistemacompra.model;

import java.util.List;

public class CestaDeCompras {

	private Integer idCesta = 0;
	private List<ItemProduto> itemProdutos;
	private Cliente cliente;
	private Double valorTotal = 0.;

	public CestaDeCompras() {
		
		idCesta++;		

	}

	public CestaDeCompras(Integer idCesta, List<ItemProduto> itemProdutos, Cliente cliente) {
		super();
		this.idCesta = idCesta;
		this.itemProdutos = itemProdutos;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "CestaDeCompras [idCestaDeCompra=" + idCesta + ", itemProdutos=" + itemProdutos + ", cliente="
				+ cliente + "]";
	}

	public Integer getIdCesta() {
		return idCesta;
	}

	public void setIdCesta(Integer idCesta) {
		this.idCesta = idCesta;
	}

	public List<ItemProduto> getItemProdutos() {
		return itemProdutos;
	}

	public void setItemProdutos(List<ItemProduto> itemProdutos) {
		this.itemProdutos = itemProdutos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getValorTotal() {
		for (ItemProduto itemProduto : itemProdutos) {
			valorTotal += itemProduto.getValorTotal();
		}
		
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
