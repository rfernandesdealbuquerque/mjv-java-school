package com.mjv.projetofinal.aventuraitens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.aventuraitens.model.Produto;
import com.mjv.projetofinal.aventuraitens.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping("/adicionarProduto")
	public String adicionarProduto(@RequestBody Produto produto) {
		return produtoService.adicionarProduto(produto);
		
	}
	
	@PutMapping("alterarProduto/{idProduto}")
	public String alterarProduto(@PathVariable Integer idProduto, @RequestBody Produto produto){
		return produtoService.alterarProduto(idProduto, produto);
		
	}
	
	@GetMapping("/listarTodos")
	public List<Produto> listarTodos(){
		return produtoService.listarTodos();
	}
	
	@DeleteMapping("deletarProduto/{idProduto}")
	public String deletarProduto(@PathVariable Integer idProduto) {
		return produtoService.deletarProduto(idProduto);
	}
	
	

}
