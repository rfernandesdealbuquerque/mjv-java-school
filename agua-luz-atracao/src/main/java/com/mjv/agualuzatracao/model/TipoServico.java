package com.mjv.agualuzatracao.model;

public enum TipoServico {
	AGUA("Água", 137.21),
	ENERGIA("Energia", 132.15);
	
	private String servico;
	private Double valorServico;
	
	private TipoServico(String servico, Double valorServico) {
		this.servico = servico;
		this.valorServico = valorServico;
	}
	
	public String getServico() {
		return this.servico;
	}
	
	public Double getValorServico() {
		return this.valorServico;
	}

}
