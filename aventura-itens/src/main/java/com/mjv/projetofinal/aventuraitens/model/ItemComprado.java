package com.mjv.projetofinal.aventuraitens.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "itens_comprados")
public class ItemComprado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_comprado_id")
	private Integer id;
	private Integer quantidade;
	private Double valorUnitario;
	private Double subTotal;
	
	@OnetoOne
	@JoinColumn(name = "id_produto", referencedColumnName = "produto_id")
	private Produto produto;
	
}
