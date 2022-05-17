package javaexplorer.controlefluxo;

public class SwitchCase {
	public static void main(String[] args) {
		minutostofracao(15);
		minutostofracao(26);
	}
	
	public static void minutostofracao (int minutos) {
		switch(minutos) { 
			case 15:
				System.out.println("1/4 de hora");
				break; //se a variavel for igual ao case, vai entrar no case e executar tudo que tem depois dali, por isso tem que ter o break
			case 20: 
				System.out.println("1/3 de hora");
				break;
			case 30:
				System.out.println("1/2 de hora");
				break;
			default:
				System.out.println("Nao eh 15, 20 nem 30");
		}
	}
}
