package com.mjv.agualuzatracao.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.Normalizer.Form;
import java.util.List;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;
import com.mjv.agualuzatracao.util.FormatadorDataLocalDateToOriginal;
import com.mjv.agualuzatracao.util.FormatadorTextoOriginalToLayout;

public class GeradorArquivoTxt {
	public static void gerarTxt(List<Contrato> contratos) {
		File dir = new File("C:/dev/mjv-java-school/agua-luz-output"); 
		
		Path path = Paths.get(dir.getAbsolutePath());
		if(!dir.exists()) { //criar diretorio se nao existir
			 try {
				Files.createDirectories(path);
		   } catch (IOException e) {
			 	e.printStackTrace();
			 	}
		}
		
	path = Paths.get(dir.getAbsolutePath(), "agua-luz-contratos.txt");
	
	for (Contrato c : contratos) {
		
		StringBuilder sb = new StringBuilder();
		Cadastro cad = c.getCadastro();
		Endereco end = cad.getEnderecoCadastro();
		
		String cpfFormatado = FormatadorTextoOriginalToLayout.formatarCPFOriginalToLayout(cad.getCpfCadastro());
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(cpfFormatado, 11));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(cad.getRgCadastro(), 10));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(cad.getNomeCadastro(), 30));
		String celFormatado = FormatadorTextoOriginalToLayout.formatarCelOriginalToLayout(cad.getCelCadastro());
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(celFormatado, 11));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(end.getLogradouro(), 20));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComZerosEsquerda(end.getNumero(), 6));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(end.getComplemento(), 10));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(end.getBairro(), 15));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(end.getCidade(), 30));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(end.getEstado(), 2));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(end.getCep().replace(".", ""), 8));
		sb.append(cad.getPais().getISO2());
		sb.append(FormatadorTextoOriginalToLayout.ajustarComZerosEsquerda(c.getProtocolo(), 10));
		String dataHoraOriginal = FormatadorDataLocalDateToOriginal.formatarDataHora(c.getDataHora(), cad.getPais().getISO2());
		String dataFormatada = FormatadorTextoOriginalToLayout.formatarDataOriginalToLayout(dataHoraOriginal.substring(0, 10));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(dataFormatada, 8));
		sb.append(FormatadorTextoOriginalToLayout.ajustarComEspacos(dataHoraOriginal.substring(11, 16).replace(":", ""), 4));
		sb.append(c.getServico().toString().substring(0,1));
		String valorOriginal = c.getValor().toString().replace(".", ",");
		sb.append(FormatadorTextoOriginalToLayout.ajustarComZerosEsquerda(valorOriginal.replace(",", ""), 8));
		sb.append(c.getNotificacao().toString().substring(0, 1) + "\n");
	
		try {
			Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}