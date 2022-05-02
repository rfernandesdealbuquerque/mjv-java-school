package com.mjv.agualuzatracao.util;

public class FormatadorTextoOriginalToLayout {
	public static String formatarCPFOriginalToLayout(String cpf) {
		
		String cpfFormatado = cpf.replace(".", "").replace("-", "");
		return cpfFormatado;
		
	}

}
