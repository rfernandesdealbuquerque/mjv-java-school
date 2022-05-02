package com.mjv.agualuzatracao.service;

import java.time.LocalDateTime;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.TipoServico;

public class GeradorContrato {
	public static Contrato gerarContrato(Cadastro cadastro) {
		
		Contrato contrato = new Contrato();
		
		contrato.setProtocolo("2022025687");
		contrato.setDataHora(LocalDateTime.of(2022, 02, 21, 16, 00));
		contrato.setServico(TipoServico.AGUA);
		contrato.setCadastro(cadastro);
		
		
		return contrato;
		
	}

}
