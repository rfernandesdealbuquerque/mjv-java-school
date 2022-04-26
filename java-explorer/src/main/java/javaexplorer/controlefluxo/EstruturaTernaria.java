package javaexplorer.controlefluxo;

public class EstruturaTernaria { //usado na atribuicao de valores a variaveis com base em condicoes - eh uma estrutura condicional de atribuicao, nao de comportamento como if else
	public static void main(String[] args) {
		simularDecolagemSimples(5123);
		simularDecolagem(8);
	}
	
	public static void simularDecolagemSimples(int altitude) {
		String voando = (altitude >= 5) ? "Decolou" : "Nao Decolou";
		System.out.println("Estagio da decolagem: " + voando);
		
	}
	public static void simularDecolagem(int altitude) {
		String voando = (altitude >= 5000) ? "Voo estavel" : ((altitude<5000 && altitude>=5) ? "Decolou e subindo" : "Nao decolou");
		System.out.println("Estagio da decolagem: " + voando);
		
	}

}
