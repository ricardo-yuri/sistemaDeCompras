package br.com.stefanini.sistemacompra.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.sistemacompra.controller.CalculaProdutoController;
import br.com.stefanini.sistemacompra.controller.VendaController;
import br.com.stefanini.sistemacompra.model.CestaDeCompras;
import br.com.stefanini.sistemacompra.model.Cliente;
import br.com.stefanini.sistemacompra.model.ItemProduto;
import br.com.stefanini.sistemacompra.model.Produto;

public class Main {

	public static void main(String[] args) throws Exception {

//		Produto dell = new Produto();
//		dell.setNome("NOTEBOOK DELL LATITUDE");
//		dell.setValor((double) 5000);
//		System.out.println(dell);
//
//		Endereco endereco1 = new Endereco();
//		endereco1.setCep("71800-00");
//		endereco1.setIdEndereco(1);
//		endereco1.setLogradouro("Quadra 500");
//
		Cliente ricardo = new Cliente();
		ricardo.setIdCliente(1);
		ricardo.setNome("Ricardo Yuri");
		ricardo.setEmail("ricardo");
		System.out.println(ricardo);
//
		Produto notebook = new Produto();
		notebook.setIdProduto(1);
		notebook.setNome("Notebook Dell");
		notebook.setValor(5500.);
		System.out.println(notebook);
		
		ItemProduto item= new ItemProduto();
		item.setProduto(notebook);
		item.setQuantidade(2);
		System.out.println(item);
		
		CalculaProdutoController itemCalc = new CalculaProdutoController();
		itemCalc.gerarPrecoItemProduto(item);
		
		List<ItemProduto> produtos = new ArrayList<ItemProduto>();
		produtos.add(item);
		
		CestaDeCompras cestaRicardo = new CestaDeCompras();
		cestaRicardo.setCliente(ricardo);
		cestaRicardo.setItemProdutos(produtos);
		System.out.println(cestaRicardo);
		
		VendaController vendaController = new VendaController();
		vendaController.realizarVenda(null, null);
	}

}
