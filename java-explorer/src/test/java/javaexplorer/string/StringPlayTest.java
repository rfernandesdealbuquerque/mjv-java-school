package javaexplorer.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javaexplorer.string.StringPlay; //nao precisa dar import pois aparentemente quando o pacote de teste tem o mesmo nome do pacote com as classes e metodos,
									   //ele ja automaticamente tem acesso a todas as classes e metodos do respectivo pacote


public class StringPlayTest { //Criar testes para cada metodo de StringPlay
							   //Cada teste unitario testa um caso especifico de input do metodo. Ou seja, podemos ter varios testes unitarios
							   //para um unico metodo, dependendo das funcionalidades e requisitos/expectativas
							   //e.g. teste unitario para cpf normal e outro teste unitario para cpf com mais de 8 digitos --> requisito/expectativa de funcionamento eh diferente para cada input. 
	
	@DisplayName("Testando Metodo concatenarString")
	@Test 
	public void concatenarStringTest() {
		Assertions.assertEquals("oioioi", StringPlay.concatenarString("oi", 3));
		
	}
	

}