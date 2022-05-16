package com.mjv.projetofinal.aventuraitens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.projetofinal.aventuraitens.model.Cadastro;
import com.mjv.projetofinal.aventuraitens.model.Produto;
import com.mjv.projetofinal.aventuraitens.repository.CadastroRepository;
import com.mjv.projetofinal.aventuraitens.repository.ProdutoRepository;

@Service
public class CadastroService {
	@Autowired
	private CadastroRepository cadastroRepository;
	
	public String adicionarCadastro(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
		return "Cadastro de nome " + cadastro.getNome() + " adicionado com sucesso!";
	}
	
	public List<Cadastro> listarTodos() {
		return cadastroRepository.findAll();
	}
	public String deletarCadastro(Integer id) {
		Cadastro cadastroDeletado = cadastroRepository.findById(id).orElse(null);
		if(cadastroDeletado == null) {
			return "id do cadastro não existe! Favor consultar cadastros e inserir id correto.";
		}
		cadastroRepository.deleteById(id);
		return "Produto de id " + cadastroDeletado.getId() + " de nome " + cadastroDeletado.getNome() + " deletado com sucesso!";
	}
	
	public String alterarCadastro(Integer id, Cadastro cadastro) {
		Cadastro cadastroAtualizado = cadastroRepository.findById(id).orElse(null);
		if(cadastroAtualizado == null) {
			return "id do cadastro não existe! Favor consultar cadastros e inserir id correto.";
		}
		cadastroAtualizado.setNome(cadastro.getNome());
		cadastroAtualizado.setCpf(cadastro.getCpf());
		cadastroAtualizado.setDataNascimento(cadastro.getDataNascimento());
		cadastroAtualizado.setEndereco(cadastro.getEndereco());
		
		cadastroRepository.save(cadastroAtualizado);
		return "Cadastro de id " + cadastroAtualizado.getId() + " alterado com sucesso!";
	}
}
