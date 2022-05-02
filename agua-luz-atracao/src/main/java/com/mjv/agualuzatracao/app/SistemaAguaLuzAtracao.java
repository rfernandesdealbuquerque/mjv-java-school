package com.mjv.agualuzatracao.app;

import java.time.LocalDateTime;
import java.util.List;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Pais;
import com.mjv.agualuzatracao.model.TipoNotificacao;
import com.mjv.agualuzatracao.model.TipoServico;
import com.mjv.agualuzatracao.repository.ContratosRepository;
import com.mjv.agualuzatracao.service.GeradorArquivoCsv;
import com.mjv.agualuzatracao.service.GeradorArquivoTxt;
import com.mjv.agualuzatracao.service.GeradorCadastro;
import com.mjv.agualuzatracao.service.GeradorContrato;
import com.mjv.agualuzatracao.service.GeradorMensagem;
import com.mjv.agualuzatracao.util.FormatadorDataLocalDateToOriginal;

public class SistemaAguaLuzAtracao {
	public static void main(String[] args) {
		
		//gerando cadastros
		Cadastro cadastro1 = GeradorCadastro.gerarCadastro("Raimundo Nonato Loureiro Castelo Branco", "007.324.223.21", "33765-5", "(11)99768-1515",
				    							   Pais.BRASIL, "Rua Sebastião Firmino", "123", "AP 210 BL CENTAURO", "São Sebastião",
				    							   "São Raimundo Nonato", "Sp", "07.210.715");
		Cadastro cadastro2 = GeradorCadastro.gerarCadastro("Gleyson Sampaio", "234.765.987-27", "54665-7", "(11)99745-3298",
				   Pais.BRASIL, "Rua das Marias", "243", "Ap 207, Bloco C", "Santo Antonio",
				   "São Paulo", "Sp", "27.310.657");
		
		//gerando contratos a partir do cadastros
		Contrato contrato1 = GeradorContrato.gerarContrato(cadastro1, "1984365", LocalDateTime.of(2022, 05, 07, 15, 21), 
												  TipoServico.AGUA, TipoNotificacao.SMS);
		Contrato contrato2 = GeradorContrato.gerarContrato(cadastro2, "2022025687", LocalDateTime.of(2022, 02, 21, 16, 00), 
				  TipoServico.AGUA, TipoNotificacao.WHATS);

		
		//String conteudo = GeradorMensagem.gerarMensagem(contrato1); //gerando conteudo para impressao a partir do contrato
		//System.out.println(conteudo);
		
		List<Contrato> contratos = ContratosRepository.getListaContratos(); //duvida - como esse objeto eh criado? como funciona o fluxo de compilacao e execucao depois de main?
		ContratosRepository.adicionarContrato(contratos, contrato1); //adicionando contrato gerado ao banco de dados de contratos
		ContratosRepository.adicionarContrato(contratos, contrato2);
		
		GeradorArquivoCsv.gerarCsv(contratos); //gerando CSV baseado na lista de contratos
		GeradorArquivoTxt.gerarTxt(contratos);
	}
}


//FLUXO DE UTILIZACAO: gerar cada cadastro e contrato e adicionar na lista, um de cada vez??? --> gerar CSV e TXT a partir da lista de contratos