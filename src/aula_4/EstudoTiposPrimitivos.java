package aula_4;

public class EstudoTiposPrimitivos {

	//os primitivos sao variaveis brutas com tamanhos bem definidos. NAO sao considerados objetos e sao armazenados na stack - quando
	//salvamos os registers na stack por meio do stack pointer e sw instruction
	//All variables for the computer are in binary. It only shows us the decimal representation for convenience.
	
	
	public static void main(String[] args) {
		
		byte MAX_BYTE = 127; // 2s complement representation --> 8 bits --> 2^-7 to 2^7 - 1
		byte MIN_BYTE = -128; 
		
		short MAX_SHORT = (short) ((Math.pow(2, 15)) - 1);
		short MIN_SHORT = (2^-15);			//hoje em dia quase nao se usam mais os tipos primitivos --> usam-se as Wrapper classes 
											//ocupam mais espaco, mas hoje tempos memoria suficiente para isso 
											//pois elas transformam os tipos primitivos em objetos para que possamos manipula-los por metodos
		
		System.out.println(MAX_SHORT);
		System.out.println(MIN_SHORT);
	}
}


