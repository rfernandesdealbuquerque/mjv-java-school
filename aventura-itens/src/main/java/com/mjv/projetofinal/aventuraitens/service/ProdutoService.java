package com.mjv.projetofinal.aventuraitens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.model.produto.Produto;
import com.mjv.projetofinal.aventuraitens.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void adicionarProduto(Produto produto) {
		produtoRepository.save(produto);
		
		
	}

}
