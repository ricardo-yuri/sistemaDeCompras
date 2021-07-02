package br.com.stefanini.sistemacompra.controller;

import br.com.stefanini.sistemacompra.model.CestaDeCompras;
import br.com.stefanini.sistemacompra.model.Cliente;
import br.com.stefanini.sistemacompra.model.Venda;

public class VendaController {
	
	public Venda realizarVenda(Cliente cliente, CestaDeCompras carrinho) {
		Venda venda = new Venda();
		venda.setValorTotal(carrinho.getValorTotal());
		venda.setIdCesta(carrinho.getIdCesta());
		return venda;
	}

}
