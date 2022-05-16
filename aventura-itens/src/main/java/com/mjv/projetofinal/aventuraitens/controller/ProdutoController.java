package com.mjv.projetofinal.aventuraitens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.aventuraitens.model.produto.Produto;
import com.mjv.projetofinal.aventuraitens.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping("/adicionarProduto")
	public String adicionarProduto(@RequestBody Produto produto) {
		produtoService.adicionarProduto(produto);
		return "Produto adicionado com sucesso!";
	}
	
	
	

}
