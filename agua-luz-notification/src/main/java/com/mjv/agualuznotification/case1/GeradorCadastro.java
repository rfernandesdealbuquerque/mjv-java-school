package com.mjv.agualuznotification.case1;

public class GeradorCadastro {
	public static Cadastro gerarCadastro() { //static nao precisa de objeto, eh metodo da classe e deve retornar um objeto cadastro
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.setNomeCadastro("Gleyson Sampaio");
		cadastro.setCpfCadastro("234.765.987-27");
		
		Endereco enderecoCadastro = new Endereco();
		enderecoCadastro.setLogradouro(" Rua das Marias, 243");
		enderecoCadastro.setComplemento("Ap 207, Bloco C");
		enderecoCadastro.setCidade(new Cidade("Sao Paulo", "SP"));
		enderecoCadastro.setBairro("Santo Antonio");
		enderecoCadastro.setCep("27.310-657");
		
		cadastro.setEnderecoCadastro(enderecoCadastro);
		
		return cadastro; 
		
	}

}
