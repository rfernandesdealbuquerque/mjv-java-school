package com.mjv.agualuzatracao.service;

import java.time.LocalDateTime;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.TipoNotificacao;
import com.mjv.agualuzatracao.model.TipoServico;

public class GeradorContrato {
	public static Contrato gerarContrato(Cadastro cadastro, String protocolo, LocalDateTime dataHora, TipoServico servico,
										 TipoNotificacao notificacao) {
		
		Contrato contrato = new Contrato();
		
		contrato.setCadastro(cadastro);
		contrato.setProtocolo(protocolo);
		contrato.setDataHora(dataHora);
		contrato.setServico(servico);
		contrato.setNotificacao(notificacao);
	
		
		return contrato;
		
	}

}
