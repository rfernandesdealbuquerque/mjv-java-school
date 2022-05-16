package com.mjv.projetofinal.aventuraitens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.aventuraitens.model.cadastro.Cadastro;
import com.mjv.projetofinal.aventuraitens.service.CadastroService;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
	@Autowired
	private CadastroService cadastroService;
	
	@PostMapping("/criarCadastro")
	public void criarCadastro(@RequestBody Cadastro cadastro) {
		cadastroService.criarCadastro(cadastro);
	}
	
	@DeleteMapping(value = "excluirCadastro/{IdCadastro}")
	public void deletarCadastro(@PathVariable("IdCadastro") Integer IdCadastro) {
		cadastroService.deletarCadastro(IdCadastro);
	}
	
	
	
};