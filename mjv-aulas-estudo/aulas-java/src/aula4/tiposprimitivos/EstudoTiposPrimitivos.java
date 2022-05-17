package aula4.tiposprimitivos;

public class EstudoTiposPrimitivos {

	//os primitivos sao variaveis brutas com tamanhos bem definidos. NAO sao considerados objetos e sao armazenados na stack - quando
	//salvamos os registers na stack por meio do stack pointer e sw instruction
	//All variables for the computer are in binary. It only shows us the decimal representation for convenience.
	
	
	public static void main(String[] args) {
		
		final byte MAX_BYTE = 127; // 2s complement representation --> 8 bits --> 2^-7 to 2^7 - 1 --> usar a palavra final --> garante que nao pode ser alterada e eh realmente uma constante
		final byte MIN_BYTE = -128; 
		
		short MAX_SHORT = (short) ((Math.pow(2, 15)) - 1);
		short MIN_SHORT = (2^-15);			//hoje em dia quase nao se usam mais os tipos primitivos --> usam-se as Wrapper classes 
											//ocupam mais espaco, mas hoje tempos memoria suficiente para isso 
											//pois elas transformam os tipos primitivos em objetos para que possamos manipula-los por metodos
		
		System.out.println(MAX_SHORT);
		System.out.println(MIN_SHORT);
		
		int numeromaior = 34;
		short numeromenor = (short) numeromaior; //NAO PODE CONVERTER DE TIPO MAIOR PRA MENOR --> para isso tem que fazer o cast (conversao de tipos)
	}
}


