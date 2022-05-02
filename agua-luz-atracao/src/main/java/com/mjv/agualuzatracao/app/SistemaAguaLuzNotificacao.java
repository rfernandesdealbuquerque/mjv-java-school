package com.mjv.agualuzatracao.app;

import java.time.LocalDateTime;
import java.util.List;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Pais;
import com.mjv.agualuzatracao.model.TipoNotificacao;
import com.mjv.agualuzatracao.model.TipoServico;
import com.mjv.agualuzatracao.service.GeradorCadastro;
import com.mjv.agualuzatracao.service.GeradorContrato;
import com.mjv.agualuzatracao.service.GeradorMensagem;
import com.mjv.agualuzatracao.service.LerArquivoTxt;

public class SistemaAguaLuzNotificacao {
	public static void main(String[] args) {
		
		
		List<String> contratos = LerArquivoTxt.lerTxt();
		
		for (String c : contratos) {
			Cadastro cadastro = GeradorCadastro.gerarCadastro(c.substring(21,51).trim(), c.substring(0,11).trim(), c.substring(11,21).trim(), c.substring(51,62).trim(), 
										  c.substring(153,155) == "BR" ? Pais.BRASIL : (c.substring(153, 155) == "US" ? Pais.EUA : Pais.ALEMANHA), 
										  c.substring(62, 82).trim(), c.substring(82, 88).trim(), c.substring(88, 98).trim(), c.substring(98, 113).trim(), 
										  c.substring(113, 143).trim(), c.substring(143, 145).trim(), c.substring(145, 153).trim());
			Contrato contrato = GeradorContrato.gerarContrato(cadastro, c.substring(155, 165), 
								LocalDateTime.of(Integer.valueOf(c.substring(165, 169)), Integer.valueOf(c.substring(169, 171)), Integer.valueOf(c.substring(171, 173)), Integer.valueOf(c.substring(173, 175)), Integer.valueOf(c.substring(175, 177))),
								c.substring(177, 179) == "A" ? TipoServico.AGUA : TipoServico.ENERGIA, 
								Double.valueOf(c.substring(179,186)), c.substring(186, 187) == "S" ? TipoNotificacao.SMS : TipoNotificacao.WHATS);
			
			String conteudo = GeradorMensagem.gerarMensagem(contrato); //gerando conteudo para impressao a partir do contrato
			System.out.println(conteudo + "\n");
		} 
		
		
	}

}
