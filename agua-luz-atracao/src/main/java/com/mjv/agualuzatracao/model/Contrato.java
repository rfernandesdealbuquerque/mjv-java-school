package com.mjv.agualuzatracao.model;

import java.time.LocalDateTime;

public class Contrato {
	private String protocolo;
	private LocalDateTime dataHora;
	private TipoServico servico;
	private TipoNotificacao notificacao;
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

	public void setServico(TipoServico servico) { //PRINCIPIO DE ENCAPSULAMENTO - definir valor do contrato automaticamente com o servico para mitigar erros
		this.servico = servico;
		this.valor = servico.getValorServico();
	}

	public Double getValor() {
		return valor;
	}

	public TipoNotificacao getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(TipoNotificacao notificacao) {
		this.notificacao = notificacao;
	}

	

}
