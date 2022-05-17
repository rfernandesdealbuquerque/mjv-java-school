package com.mjv.agualuzatracao.repository;

import java.util.ArrayList;
import java.util.List;

import com.mjv.agualuzatracao.model.Contrato;

public class ContratosRepository {
	private static List<Contrato> contratos = new ArrayList<Contrato>();
	
	public static List<Contrato> getListaContratos(){
		return contratos;
	}
	public static void adicionarContrato(List<Contrato> contratos, Contrato contrato) {
		contratos.add(contrato);
	}

}
