package com.mjv.agualuzatracao.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;
import com.mjv.agualuzatracao.util.FormatadorDataLocalDateToOriginal;

public class GeradorArquivoCsv {
	public static void gerarCsv(List<Contrato> contratos){//recebe a lista de contratos i.e. nosso banco de dados
		 
		File dir = new File("C:/dev/mjv-java-school/agua-luz-output"); 
		
		Path path = Paths.get(dir.getAbsolutePath());
		if(!dir.exists()) { //criar diretorio se nao existir
			 try {
				Files.createDirectories(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		path = Paths.get(dir.getAbsolutePath(), "agua-luz-contratos.csv");
		
		for (Contrato c : contratos) {
			
			StringBuilder sb = new StringBuilder();
			Cadastro cad = c.getCadastro();
			Endereco end = cad.getEnderecoCadastro();
			
			sb.append(cad.getCpfCadastro() + ";");
			sb.append(cad.getRgCadastro() + ";");
			sb.append(cad.getNomeCadastro() + ";");
			sb.append(cad.getCelCadastro() + ";");
			sb.append(end.getLogradouro() + ";");
			sb.append(end.getNumero() + ";");
			sb.append(end.getComplemento() + ";");
			sb.append(end.getBairro() + ";");
			sb.append(end.getCidade() + ";");
			sb.append(end.getEstado() + ";");
			sb.append(end.getCep() + ";");
			sb.append(cad.getPais().getNomePais() + ";");
			sb.append(c.getProtocolo() + ";");
			String dataHoraFormatado = FormatadorDataLocalDateToOriginal.formatarDataHora(c.getDataHora(), cad.getPais().getISO2());
			sb.append(dataHoraFormatado.substring(0, 10) + ";");
			sb.append(dataHoraFormatado.substring(11,16) + ";");
			sb.append(c.getServico() + ";");
			sb.append(c.getValor() + ";");
			sb.append(c.getNotificacao() + ";\n");
			
			//escrever contrato (sb) no arquivo csv
			try {
				Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	

	}
}
