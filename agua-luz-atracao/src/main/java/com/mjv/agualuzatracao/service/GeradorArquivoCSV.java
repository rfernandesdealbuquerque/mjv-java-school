package com.mjv.agualuzatracao.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;

public class GeradorArquivoCSV {
	public static void gerarCSV(List<Contrato> contratos){
		 
		File dir = new File("C:/dev/mjv-java-school/agua-luz-output"); 
		
		Path path = Paths.get(dir.getAbsolutePath());
		if(!dir.exists()) { //criar diretorio se nao existir
			 try {
				Files.createDirectories(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
			
			
			//escrever contrato (sb) no arquivo csv
			try {
				Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	

	}
}
