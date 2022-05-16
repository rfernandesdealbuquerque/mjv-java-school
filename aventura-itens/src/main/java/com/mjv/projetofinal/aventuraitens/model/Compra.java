package com.mjv.projetofinal.aventuraitens.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "compra_id")
	private Integer id;
	private Double valorTotal;
	private String TipoPagamento;
	
	@OneToMany(cascade = CascadeType.ALL) //ao inserirmos uma compra, queremos que isso reflita no banco de itens comprados
	@JoinColumn(name = "compra_id")
	private List<ItemComprado> itensComprados;
	
	@ManyToOne //uma compra necessitara sempre de um cadastro para ser criada; sem cascade porque se compra deletada, nao queremos que cadastro seja deletado
	@JoinColumn(name = "cadastro_id")
	private Integer cadastroId;
	
	private LocalDateTime dataHoraCompra;

	public Integer getId() {
		return id;
	}

	public Integer getCadastroId() {
		return cadastroId;
	}

	public void setCadastroId(Integer cadastroId) {
		this.cadastroId = cadastroId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getTipoPagamento() {
		return TipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		TipoPagamento = tipoPagamento;
	}

	public List<ItemComprado> getItensComprados() {
		return itensComprados;
	}

	public void setItensComprados(List<ItemComprado> itensComprados) {
		this.itensComprados = itensComprados;
	}

	public LocalDateTime getDataHoraCompra() {
		return dataHoraCompra;
	}

	public void setDataHoraCompra(LocalDateTime dataHoraCompra) {
		this.dataHoraCompra = dataHoraCompra;
	}
	
	
	
}
