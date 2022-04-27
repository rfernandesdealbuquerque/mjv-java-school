package com.mjv.agualuznotification.case2;

import java.time.LocalDate;

public class GeradorContrato {
	public static Contrato gerarContrato(Cadastro cadastro) {
		
		Contrato contrato = new Contrato();
		
		contrato.setProtocolo("2022025687");
		
		
		contrato.setData(LocalDate data);
	
		
		contrato.setServico(TipoServico.AGUA);
		contrato.setValor(TipoServico.AGUA.getPreco());
		contrato.setCadastro(cadastro);
		
		
		return contrato;
		
	}

}
