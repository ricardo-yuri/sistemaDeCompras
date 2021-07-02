package br.com.stefanini.sistemacompra.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.sistemacompra.dto.ProdutoDto;
import br.com.stefanini.sistemacompra.model.Produto;

public class ProdutoDao {

	private List<Produto> produtos;

	public ProdutoDao() {
		produtos = new ArrayList<Produto>();
	}

	private Produto dtoToProduto(ProdutoDto produtoDto) {
		Produto produto = new Produto();
		produto.setIdProduto(produtoDto.getIdProduto());
		produto.setNome(produtoDto.getNome());
		produto.setValor(produtoDto.getValor());
		return produto;
	}

	public void adicionaProduto(ProdutoDto produtoDto) {
		Produto produto = dtoToProduto(produtoDto);
		produtos.add(produto);
	}
}
