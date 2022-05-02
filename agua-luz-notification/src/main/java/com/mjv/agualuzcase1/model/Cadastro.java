package com.mjv.agualuzcase1.model;

public class Cadastro {
	private String nomeCadastro;
	private String cpfCadastro;
	private Endereco enderecoCadastro;
	
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

}
