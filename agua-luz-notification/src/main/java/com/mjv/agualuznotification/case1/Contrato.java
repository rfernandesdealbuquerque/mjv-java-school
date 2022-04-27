package com.mjv.agualuznotification.case1;

import java.time.LocalDateTime;

public class Contrato {
	private String protocolo;
	private LocalDateTime dataHora;
	private TipoServico servico;
	private Double valor;
	private Cadastro cadastro;
	
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	
	public Cadastro getCadastro() {
		return this.cadastro;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public TipoServico getServico() {
		return servico;
	}

	public void setServico(TipoServico servico) {
		this.servico = servico;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	

}
