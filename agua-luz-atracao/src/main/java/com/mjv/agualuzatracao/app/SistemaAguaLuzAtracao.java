package com.mjv.agualuzatracao.app;

import java.util.List;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.repository.ContratosRepository;
import com.mjv.agualuzatracao.service.GeradorArquivoCSV;
import com.mjv.agualuzatracao.service.GeradorCadastro;
import com.mjv.agualuzatracao.service.GeradorContrato;
import com.mjv.agualuzatracao.service.GeradorMensagem;
import com.mjv.agualuzatracao.util.FormatadorDataLayoutToOriginalUtil;

public class SistemaAguaLuzAtracao {
	public static void main(String[] args) {
		
		Cadastro cadastro1 = new Cadastro();
		cadastro1 = GeradorCadastro.gerarCadastro();
		
		Contrato contrato1 = new Contrato();
		contrato1 = GeradorContrato.gerarContrato(cadastro1); //gerando contrato a partir do cadastro
		
		String conteudo = GeradorMensagem.gerarMensagem(contrato1); //gerando conteudo para impressao a partir do contrato
		System.out.println(conteudo);
		
		List<Contrato> contratos = ContratosRepository.getListaContratos(); //duvida - como esse objeto eh criado? como funciona o fluxo de compilacao e execucao depois de main?
		ContratosRepository.adicionarContrato(contratos, contrato1); //adicionando contrato gerado a lista de contratos
		
		GeradorArquivoCSV.gerarCSV(contratos); //gerando CSV baseado na lista de contratos
	}
}


//FLUXO DE UTILIZACAO: gerar cada cadastro e contrato e adicionar na lista, um de cada vez??? --> gerar CSV e TXT a partir da lista de contratos