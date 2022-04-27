package com.mjv.agualuznotification.case2;

public enum TipoServico {
	AGUA("Agua", 127.33),
	LUZ("Luz", 132.15);
	
	private String servico;
	private Double preco;
	
	private TipoServico(String servico, Double preco) {
		this.servico = servico;
		this.preco = preco;
	}
	
	public String getServico() {
		return this.servico;
	}
	
	public Double getPreco() {
		return this.preco;
	}

}
