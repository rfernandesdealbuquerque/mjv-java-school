package com.mjv.agualuznotification.case2;

public class Cidade {
	private String nomeCidade;
	private String siglaCidade;
	
	public Cidade() {
		this("NAO INFORMADO", "NAO INFORMADO");
	}

	public Cidade(String name, String sigla) {
		this.nomeCidade = name;
		this.siglaCidade = sigla;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String name) {
		this.nomeCidade = name;
	}

	public String getSiglaCidade() {
		return siglaCidade;
	}

	public void setSiglaCidade(String sigla) {
		this.siglaCidade = sigla;
	}
	
	

}
