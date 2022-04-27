package com.mjv.agualuznotification.case1;

public class GeradorMensagem {
	public static String gerarMensagem(Contrato contrato) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Senhor(a) ");
		sb.append(contrato.getCadastro().getNomeCadastro());
		sb.append(" cpf de numero ");
		sb.append(contrato.getCadastro().getCpfCadastro());
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
		sb.append("endereço abaixo:\n");
		sb.append("\u2022");
		
		
		
		
		
		
		
		
		
		
		
		return sb.toString();
		
	}
}
