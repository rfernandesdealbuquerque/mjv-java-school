package com.mjv.openbanking;

import java.time.LocalDate;

public class SistemaProcessamento {
	public static void main(String[] args) {
		Movimentacao mov = new Movimentacao();
		mov.setData(LocalDate.of(2022, 04, 16));
		mov.setCpfCnpj("135.217.791-18");
		mov.setNome("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
		mov.setValor(1275.48);
		mov.setTipo(TipoMovimentacao.RECEITA);
		mov.setEstornado(true);
		
		String conteudoGerado = GeradorConteudo.gerarConteudo(mov);
		System.out.println(conteudoGerado);
	}


}
