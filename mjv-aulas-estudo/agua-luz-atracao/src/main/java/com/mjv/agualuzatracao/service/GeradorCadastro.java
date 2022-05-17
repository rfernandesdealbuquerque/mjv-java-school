package com.mjv.agualuzatracao.service;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Endereco;
import com.mjv.agualuzatracao.model.Pais;

public class GeradorCadastro {
	public static Cadastro gerarCadastro(String nome, String cpf, String rg, String cel, Pais pais, 
										 String logradouro, String numero, String complemento, String bairro, 
										 String cidade, String estado,  String cep) { //static nao precisa de objeto, eh metodo da classe e deve retornar um objeto cadastro
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.setNomeCadastro(nome);
		cadastro.setCpfCadastro(cpf);
		cadastro.setRgCadastro(rg);
		cadastro.setCelCadastro(cel);
		cadastro.setPais(pais);
		
		Endereco enderecoCadastro = new Endereco();
		enderecoCadastro.setLogradouro(logradouro);
		enderecoCadastro.setNumero(numero);
		enderecoCadastro.setComplemento(complemento);
		enderecoCadastro.setCidade(cidade);
		enderecoCadastro.setEstado(estado);
		enderecoCadastro.setBairro(bairro);
		enderecoCadastro.setCep(cep);
		
		cadastro.setEnderecoCadastro(enderecoCadastro);
		
		return cadastro; 
		
	}

}
