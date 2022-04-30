package javaexplorer.operadores;

public class EstudoOperadores {
	public static void main(String[] args) {
		exemploConcatenacao();
		exemploIncrementacao();

	}

	public static void exemploConcatenacao() {
		String contatenacao = "1"+(1+1+1)+"1"; //So imprime 11111 sem parenteses ou quando comeca com string "1"
		System.out.println(contatenacao);
	}
	
	public static void exemploIncrementacao() {
		int valor = 3;
		System.out.println(valor++); //imprime 3 - incrementacao POS exibicao
		System.out.println(++valor); //imprime 5 - incrementacao anterior + incrementacao atual PRE exibicao
		
	}
}