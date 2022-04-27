package com.mjv.agualuznotification.case1;

import java.time.LocalDateTime;

public class GeradorContrato {
	public static Contrato gerarContrato(Cadastro cadastro) {
		
		Contrato contrato = new Contrato();
		
		contrato.setProtocolo("2022025687");
		contrato.setDataHora(LocalDateTime.of(2022, 02, 21, 16, 00));
		contrato.setServico(TipoServico.AGUA);
		contrato.setValor(127.33);
		contrato.setCadastro(cadastro);
		
		
		return contrato;
		
	}

}
