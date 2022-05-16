package com.mjv.projetofinal.aventuraitens.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double valorTotal;
	private String TipoPagamento;
	private List<ItemComprado> itensComprados;
	private LocalDateTime dataHoraInclusao;
	
}
