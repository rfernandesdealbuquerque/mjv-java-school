package aula_6_parte1$OOP_ClassesObjetosConstrutores;

public class Aeroporto {
	public static void main(String [] args) {
		Aviao aviao1 = new Aviao("737", "Boeing");
		//aviao1.companhiaAerea = "Gol";
		
		System.out.println(aviao1.modelo);
		System.out.println(aviao1.construtora);
		System.out.println(aviao1.companhiaAerea);
		
	}

}
