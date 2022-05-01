package com.mjv.agualuznotification.case1.app;

import com.mjv.agualuznotification.case1.model.Cadastro;
import com.mjv.agualuznotification.case1.model.Contrato;
import com.mjv.agualuznotification.case1.service.GeradorCadastro;
import com.mjv.agualuznotification.case1.service.GeradorContrato;
import com.mjv.agualuznotification.case1.service.GeradorMensagem;

public class SistemaAguaLuzNotification {
	public static void main(String[] args) {
		Cadastro cadastro1 = new Cadastro();
		cadastro1 = GeradorCadastro.gerarCadastro();
		
		Contrato contrato1 = new Contrato();
		contrato1 = GeradorContrato.gerarContrato(cadastro1); //gerando contrato a partir do cadastro
		
		String conteudo = GeradorMensagem.gerarMensagem(contrato1); //gerando conteudo para impressao a partir do contrato
		System.out.println(conteudo);
	}
}
