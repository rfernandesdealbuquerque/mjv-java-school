package com.mjv.projetofinal.aventuraitens.dto;

import java.util.List;

public class CompraDto {
	private String TipoPagamento;
	private Integer idCadastro;
	private List<ItemCompradoDto> itensComprados;
	
	public String getTipoPagamento() {
		return TipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		TipoPagamento = tipoPagamento;
	}
	public Integer getIdCadastro() {
		return idCadastro;
	}
	public void setIdCadastro(Integer idCadastro) {
		this.idCadastro = idCadastro;
	}
	public List<ItemCompradoDto> getItensComprados() {
		return itensComprados;
	}
	public void setItensComprados(List<ItemCompradoDto> itensComprados) {
		this.itensComprados = itensComprados;
	}
	

}
