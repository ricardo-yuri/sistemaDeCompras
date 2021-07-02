package br.com.stefanini.sistemacompra.controller;

import br.com.stefanini.sistemacompra.model.ItemProduto;

public class CalculaProdutoController {

	public void gerarPrecoItemProduto(ItemProduto item) throws Exception {
		if (item == null) {
			throw new Exception("Item deve possuir instancia");
		}
		item.setValorTotal(item.getProduto().getValor() * item.getQuantidade());

	}
}
