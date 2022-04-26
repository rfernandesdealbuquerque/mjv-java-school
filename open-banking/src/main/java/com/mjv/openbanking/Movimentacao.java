package com.mjv.openbanking;

import java.time.LocalDate;

public class Movimentacao {
	//Quais sao os atributos de cada movimentacao, i.e. que caracterizam cada movimentacao?
	//PADRAO JAVA BEANS --> atributos privados + uso de getters e setters para obter e atualizar 
	private LocalDate data;
	private String cpfCnpj;
	private String nome;
	private Double valor;
	private TipoMovimentacao tipo;
	private boolean estornado;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}
	public boolean isEstornado() {
		return estornado;
	}
	public void setEstornado(boolean estornado) {
		this.estornado = estornado;
	}
	
	
	
	

}
