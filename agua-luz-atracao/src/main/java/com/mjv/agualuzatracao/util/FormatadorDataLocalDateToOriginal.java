package com.mjv.agualuzatracao.util;

import java.time.LocalDateTime;

import com.mjv.agualuzatracao.model.Pais;

public class FormatadorDataLocalDateToOriginal {
	public static String formatarDataHora(LocalDateTime dataHora, String iso2) { //formata objeto LocalDateTime no formato string correto de acordo com pais
		
		String dataHoraFormatado;
		
		if(iso2 == "US") {
			String hora = dataHora.toString().substring(11,16);
			String dia = dataHora.toString().substring(8,10);
			String mes = dataHora.toString().substring(5,7);
			String ano = dataHora.toString().substring(0,4);
			
			
			dataHoraFormatado = String.format("%s/%s/%s %s", mes, dia, ano, hora);
		
			
		}
		else {
			String hora = dataHora.toString().substring(11,16);
			String dia = dataHora.toString().substring(8,10);
			String mes = dataHora.toString().substring(5,7);
			String ano = dataHora.toString().substring(0,4);
			
			
			dataHoraFormatado = String.format("%s/%s/%s %s", dia, mes, ano, hora);
			
		}
		return dataHoraFormatado;
	}

}

