package com.mjv.projetofinal.aventuraitens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.model.Cadastro;
import com.mjv.projetofinal.aventuraitens.model.Compra;
import com.mjv.projetofinal.aventuraitens.repository.CadastroRepository;
import com.mjv.projetofinal.aventuraitens.repository.CompraRepository;

@Service
public class CompraService {
	//incluir listar compras por cada cadastro
	
	@Autowired 
	private CompraRepository compraRepository;
	
	@Autowired 
	private CadastroRepository cadastroRepository;
	
	public String adicionarCompra(Compra compra) {
		Cadastro cadastroCompra = cadastroRepository.findById(compra.getCadastroId()).orElse(null);
		if(cadastroCompra == null) {
			return "id do cadastro não existe! Favor consultar cadastros e inserir Id correto ou adicionar novo cadastro antes de incluir compra.";
		}
		compraRepository.save(compra);
		return "Compra adicionada com sucesso ao cadastro de id" + cadastroCompra.getId();
	}
}
