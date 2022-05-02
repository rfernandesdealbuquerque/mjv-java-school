package com.mjv.agualuzatracao.util;

public class FormatadorCPFOriginalToLayout {
	public static String formatarCPFOriginalToLayout(String cpf) {
		
		String cpfFormatado = cpf.replace(".", "").replace("-", "");
		return cpfFormatado;
		
	}

}
