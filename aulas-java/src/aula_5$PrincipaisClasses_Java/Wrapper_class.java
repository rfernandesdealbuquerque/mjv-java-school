package aula_5$PrincipaisClasses_Java;

public class Wrapper_class {
	public static void main(String[] args) {
		int inteiro_primitivo = 10;
		String s = "123";
	
		
		Integer wrapper = Integer.valueOf(inteiro_primitivo);
		String hex = Integer.toHexString(inteiro_primitivo);
		//Integer hex_to_decimal = Integer.valueOf(hex);
		int compare = Integer.compare(inteiro_primitivo, inteiro_primitivo);
		int bitcount = Integer.bitCount(inteiro_primitivo); //0000000001010
		int reverse = Integer.reverse(inteiro_primitivo);//010100000000000
		int numero = Integer.parseInt(s);//chamando o metodo na classe -> metodos estaticos
		numero = Integer.valueOf(123);
		String numero_string = wrapper.toString(); //chamando o metodo no objeto wrapper 
		float x = wrapper.floatValue();
		/*
		classes wrapper permitem transformarmos os valores dos tipos primitivos em objetos 
		para que possamos chamar metodos e operar em cima desse valores de forma mais sofisticada
		*/
		System.out.println(wrapper);
		System.out.println(hex);
		System.out.println(compare);
		System.out.println(bitcount);
		System.out.println(reverse);
		
		
		
		
	}

}
