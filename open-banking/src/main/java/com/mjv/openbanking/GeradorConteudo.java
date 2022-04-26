package com.mjv.openbanking;

public class GeradorConteudo {
	public static String gerarConteudo(Movimentacao mov) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(mov.getData().toString().replace("-", ""));
		
		String cpfcnpj = mov.getCpfCnpj().replace(".", "").replace("-", "");
		sb.append(String.format("%s", cpfcnpj));
		
		sb.append(mov.getNome());
		
		sb.append(mov.getValor().toString().replaceAll("[\\.\\,]", "")); //USAR STRING FORMAT PARA DEIXAR NO FORMATO CORRETO
		
		sb.append(mov.getTipo().getSigla());
		
		if (mov.isEstornado()) sb.append("1");
		else sb.append("0");
		
		
		return sb.toString();
		
	}

}
