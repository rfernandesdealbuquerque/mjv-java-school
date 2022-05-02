package com.mjv.agualuzatracao.util;

public class FormatadorTextoOriginalToLayout {
	
	public static String ajustarComEspacos(String textoOriginal, int tamanho){
		String completaComEspacos = String.format("%" + -tamanho + "s", textoOriginal.toUpperCase());//completa se necessario
		return completaComEspacos.substring(0, tamanho); //corta se necessario
	}
	
	//se for maior que tamanho, nao vai mudar nada, so cortar
	//se for menor que tamanho, completar com espacos e retornar
	
	public static String ajustarComZerosEsquerda(String textoOriginal, int tamanho) {
		String completaComZerosEsquerda = String.format("%" + tamanho + "s", textoOriginal).replace(" ", "0");//completa se necessario
		return completaComZerosEsquerda.substring(0, tamanho);//corta se necessario
	}
	public static String formatarCPFOriginalToLayout(String cpf) {
		String cpfFormatado = cpf.replace(".", "").replace("-", "");
		return cpfFormatado;
		
	}
	
	public static String formatarCelOriginalToLayout(String cel) {
		String celFormatado = cel.replace("(", "").replace(")", "").replace("-", "");
		return celFormatado;
	}


	public static String formatarDataOriginalToLayout(String data) {
		String dataFormatada = data.replace("/", "");
		dataFormatada = dataFormatada.substring(4, 8) + dataFormatada.substring(2, 4) + dataFormatada.substring(0, 2);
		return dataFormatada;
	}
	
}
