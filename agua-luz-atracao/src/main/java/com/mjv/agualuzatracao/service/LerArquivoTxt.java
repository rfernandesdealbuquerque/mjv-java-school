package com.mjv.agualuzatracao.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivoTxt {
	public static List<String> lerTxt(){
		File dir = new File("C:/dev/mjv-java-school/agua-luz-output"); 
		Path path = Paths.get(dir.getAbsolutePath(), "agua-luz-contratos.txt");
		
		try {
			List<String> contratos = Files.readAllLines(path);
			return contratos;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
}
}