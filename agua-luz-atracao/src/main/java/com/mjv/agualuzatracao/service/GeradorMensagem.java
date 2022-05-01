package com.mjv.agualuzatracao.service;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;

public class GeradorMensagem {
	public static String gerarMensagem(Contrato contrato) {
		
		StringBuilder sb = new StringBuilder();
		
		Cadastro cadastro = contrato.getCadastro();
		Endereco endereco = cadastro.getEnderecoCadastro();
		
		sb.append("Senhor(a) ");
		
		sb.append(String.format("Senhor(a) %s cpf de numero %s " , cadastro.getNomeCadastro(), cadastro.getCpfCadastro()));
		sb.append(", Informamos que conforme contrato com protocolo de numero ");
		sb.append(contrato.getProtocolo());
		sb.append(" esta\n");
		sb.append("agendado para a data\\hora ");
		sb.append(contrato.getDataHora().toString().replace("T", " "));
		sb.append(" a instalacao do servico de ");
		sb.append(contrato.getServico().getServico());
		sb.append(" com taxa de valor R$ ");
		sb.append(contrato.getValor().toString());
		sb.append(" em sua residência localizada no\n");
		sb.append("endereço abaixo:\n\n");
		sb.append("\u2022");
		sb.append("Logradouro: " + endereco.getLogradouro() + ", " + endereco.getNumero());
		sb.append("\n\u2022");
		sb.append("Complemento: " + endereco.getComplemento());
		sb.append("\n\u2022");
		sb.append("Bairro: " + endereco.getBairro());
		sb.append("\n\u2022");
		sb.append("Cidade: " + endereco.getCidade() + " / " 
		+ endereco.getEstado());
		sb.append("\n\u2022");
		sb.append("Cep: " + endereco.getCep());
		
		return sb.toString();
		
	}
}
