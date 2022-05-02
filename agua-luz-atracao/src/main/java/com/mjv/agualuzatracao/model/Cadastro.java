package com.mjv.agualuzatracao.model;

public class Cadastro {
	private String nomeCadastro;
	private String cpfCadastro;
	private String rgCadastro;
	private Endereco enderecoCadastro;
	private Pais pais;
	
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public String getNomeCadastro() {
		return nomeCadastro;
	}
	
	public void setNomeCadastro(String nomeCadastro) {
		this.nomeCadastro = nomeCadastro;
	}

	public String getCpfCadastro() {
		return cpfCadastro;
	}

	public void setCpfCadastro(String cpfCadastro) {
		this.cpfCadastro = cpfCadastro;
	}

	public Endereco getEnderecoCadastro() {
		return enderecoCadastro;
	}

	public void setEnderecoCadastro(Endereco enderecoCadastro) {
		this.enderecoCadastro = enderecoCadastro;
	}
	public String getRgCadastro() {
		return rgCadastro;
	}
	public void setRgCadastro(String rgCadastro) {
		this.rgCadastro = rgCadastro;
	}

}
