package com.mjv.projetofinal.aventuraitens.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.model.Aventura;
import com.mjv.projetofinal.aventuraitens.model.Produto;
import com.mjv.projetofinal.aventuraitens.repository.AventuraRepository;
import com.mjv.projetofinal.aventuraitens.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private AventuraRepository aventuraRepository;
	
	
	public String adicionarProduto(Produto produto) {
		//Optional<Aventura> checarAventuraByName = aventuraRepository.findByNomeAventuraContaining(produto.getAventura().getNomeAventura());
		if(aventuraRepository.findById(produto.getAventura().getId()).orElse(null) == null) {
			return "id da aventura não existe! Favor consultar aventuras e inserir Id correto ou criar nova aventura.";
		}
		produtoRepository.save(produto);
		return "Produto de nome " + produto.getNomeProduto() + "adicionado com sucesso!";
		
	}

	public String alterarProduto(Integer id, Produto produto) {
		Produto produtoAtualizado = produtoRepository.findById(id).orElse(null);
		if(produtoAtualizado == null) {
			return "id do produto não existe! Favor consultar produtos e inserir id correto ou adicionar novo produto.";
		}
		if(aventuraRepository.findById(produto.getAventura().getId()).orElse(null) == null) {
			return "id da aventura não existe! Favor consultar aventuras e inserir Id correto ou criar nova aventura.";
		}
		produtoAtualizado.setAventura(produto.getAventura());
		produtoAtualizado.setDescricao(produto.getDescricao());
		produtoAtualizado.setNomeProduto(produto.getNomeProduto());
		produtoAtualizado.setPreco(produto.getPreco());
		produtoAtualizado.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque()); //Usar para alterar estoque
		
		produtoRepository.save(produtoAtualizado);
	
		return "Produto de id " + produtoAtualizado.getId() + " alterado com sucesso!";
		
	}

	public List<Produto> listarTodos() {
		return produtoRepository.findAll();
	}
	
	public String deletarProduto(Integer id) {
		Produto produtoDeletado = produtoRepository.findById(id).orElse(null);
		if(produtoDeletado == null) {
			return "id do produto não existe! Favor consultar produtos e inserir id correto.";
		}
		produtoRepository.deleteById(id);
		return "Produto de id " + produtoDeletado.getId() + " de nome " + produtoDeletado.getNomeProduto() + " deletado com sucesso!";
	}


}
