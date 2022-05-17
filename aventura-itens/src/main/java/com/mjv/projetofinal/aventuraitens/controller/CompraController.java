package com.mjv.projetofinal.aventuraitens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.aventuraitens.dto.CompraDto;
import com.mjv.projetofinal.aventuraitens.model.Compra;
import com.mjv.projetofinal.aventuraitens.service.CompraService;

@RestController
@RequestMapping("/compras")
public class CompraController {
	@Autowired
	private CompraService compraService;
	
	@PostMapping("/adicionarCompra")
	public String adicionarCompra(@RequestBody CompraDto compra) {
		return compraService.adicionarCompra(compra);
	}

}
