package com.mjv.agualuzatracao.model;

public enum TipoServico {
	AGUA("Agua"),
	LUZ("Luz");
	
	private String servico;
	
	private TipoServico(String servico) {
		this.servico = servico;
	}
	
	public String getServico() {
		return this.servico;
	}

}
