package com.mjv.projetofinal.aventuraitens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.model.cadastro.Cadastro;
import com.mjv.projetofinal.aventuraitens.repository.CadastroRepository;

@Service
public class CadastroService {
	@Autowired
	private CadastroRepository cadastroRepository;
	
	public void criarCadastro(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
	}
	
	public void deletarCadastro(Integer id) {
		cadastroRepository.deleteById(id);
	}
}
