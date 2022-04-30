package javaexplorer.controlefluxo;
import java.util.concurrent.ThreadLocalRandom;

public class ControleFluxoRepeticao {
	public static void main(String[] args) {
		//breakLoop();
		//continueLoop();
		whileLoop();
	}
	
	
	public static void whileLoop() {
		int litragemPiscina = 500000;
		int litragemEnchida = 0;
		int dias = 0;
		
		while (litragemEnchida < litragemPiscina) {
			int encherHoje = ThreadLocalRandom.current().nextInt(10000, 500000);
			int litragemFaltandoComecoDia = litragemPiscina - litragemEnchida;
			litragemEnchida += litragemEnchida + encherHoje;
			dias ++;
			if(litragemEnchida<500000)
				System.out.println("Joao encheu " + encherHoje + " litros no " + dias + " dia. Ainda faltam " + 
				(litragemPiscina - litragemEnchida) + " litros.");
			else System.out.println("Joao encheu " + litragemFaltandoComecoDia + " litros no " + dias + " dia. Piscina cheia!");
		}
		
		System.out.println("Joao terminou de encher a piscina em " + dias + " dias.");
	}
	
	
	public static void breakLoop() {
		for (int x = 0; x<=10; x++) {
			if(x==7) break; //para a execucao e sai do for loop quando a condicao eh satisfeita
			System.out.println(x);
		}
	}
	
	public static void continueLoop() {
		for (int x = 0; x<=10; x++) {
			if(x==7) continue; //pula de volta para o for loop sem executar o que se segue fora do if quando a condicao eh satisfeita
			System.out.println(x);
		}
	}
	
	
}
