package com.mjv.agualuzatracao.app;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.service.GeradorCadastro;
import com.mjv.agualuzatracao.service.GeradorContrato;
import com.mjv.agualuzatracao.service.GeradorMensagem;

public class SistemaAguaLuzAtracao {
	public static void main(String[] args) {
		Cadastro cadastro1 = new Cadastro();
		cadastro1 = GeradorCadastro.gerarCadastro();
		
		Contrato contrato1 = new Contrato();
		contrato1 = GeradorContrato.gerarContrato(cadastro1); //gerando contrato a partir do cadastro
		
		String conteudo = GeradorMensagem.gerarMensagem(contrato1); //gerando conteudo para impressao a partir do contrato
		System.out.println(conteudo);
	}
}
