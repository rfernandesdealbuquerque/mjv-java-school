package com.mjv.projetofinal.aventuraitens.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.dto.CompraDto;
import com.mjv.projetofinal.aventuraitens.dto.ItemCompradoDto;
import com.mjv.projetofinal.aventuraitens.model.Cadastro;
import com.mjv.projetofinal.aventuraitens.model.Compra;
import com.mjv.projetofinal.aventuraitens.model.ItemComprado;
import com.mjv.projetofinal.aventuraitens.model.Produto;
import com.mjv.projetofinal.aventuraitens.repository.CadastroRepository;
import com.mjv.projetofinal.aventuraitens.repository.CompraRepository;
import com.mjv.projetofinal.aventuraitens.repository.ProdutoRepository;

@Service
public class CompraService {
	//incluir listar compras por cada cadastro
	@Autowired 
	private CompraRepository compraRepository;
	
	@Autowired 
	private CadastroRepository cadastroRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public String adicionarCompra(CompraDto compraDto) {
		Compra compra = new Compra();
		Cadastro cadastro = new Cadastro();
		List<ItemComprado> itensComprados = new ArrayList<ItemComprado>();
		Double valorTotal = 0.0;
		for (ItemCompradoDto item : compraDto.getItensComprados()) {
			if(produtoRepository.findById(item.getIdProduto()).orElse(null) == null) {
				return "id inserido de algum produto não existe! Favor consultar produtos e inserir ids corretos";
			}
			ItemComprado itemComprado = new ItemComprado();
			Produto produto = new Produto();
			produto.setId(item.getIdProduto());
			itemComprado.setProduto(produto);
			itemComprado.setQuantidade(item.getQuantidade());
			Double valorUnitario = produtoRepository.findById(item.getIdProduto()).orElse(null).getPreco();
			itemComprado.setValorUnitario(valorUnitario);
			itemComprado.setSubTotal(valorUnitario*item.getQuantidade());
			valorTotal += itemComprado.getSubTotal();
			itensComprados.add(itemComprado);
			
		}
		compra.setItensComprados(itensComprados);
		cadastro.setId(compraDto.getIdCadastro());
		compra.setCadastro(cadastro);
		compra.setTipoPagamento(compraDto.getTipoPagamento());
		compra.setValorTotal(valorTotal);
		
		Cadastro cadastroCompra = cadastroRepository.findById(compra.getCadastro().getId()).orElse(null);
		if(cadastroCompra == null) {
			return "id do cadastro não existe! Favor consultar cadastros e inserir id correto ou adicionar novo cadastro antes de incluir compra.";
		}
	
		compraRepository.save(compra);
		return "Compra adicionada com sucesso ao cadastro de id " + cadastroCompra.getId();
	}
}
