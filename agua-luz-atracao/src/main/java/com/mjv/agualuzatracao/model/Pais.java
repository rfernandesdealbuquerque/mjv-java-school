package com.mjv.agualuzatracao.model;

public enum Pais {
	BRASIL("Brasil", "BR"),
	EUA("Estados Unidos", "US"),
	ALEMANHA("Alemanha", "DE");
	
	private String nome;
	private String iso2;
	
	private Pais(String nome, String iso2) {
		this.nome = nome;
		this.iso2 = iso2;
	}
	
	public String getNomePais() {
		return this.nome;
	}
	
	public String getISO2() {
		return this.iso2;
	}

}
