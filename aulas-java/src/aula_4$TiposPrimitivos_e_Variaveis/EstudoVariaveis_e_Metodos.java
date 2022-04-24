package aula_4$TiposPrimitivos_e_Variaveis;

public class EstudoVariaveis_e_Metodos { //sempre comeca com MAIUSCULA e possui o mesmo nome do arquivo.
	// CORPO DA CLASS
	/* A class is a template/blueprint/category in which its respective Java objects are created.
	 * A classe é onde fica armazenado o código fonte (source code) que vai ser primeiro COMPILADO e transformado em byte-code
	 * para depois ser INTERPRETADO pela JVM. 
	 * Java is both compiled and interpreted. Compiled into JVM software specific byte-code, not hardware specific like compiled languages.
	 * The JVM goes through and executes the Java programs line-by-line.
	 * That's why Java is so portable and runs equally in every machine. --> No creation of CPU Architecture specific assembly and machine code.
	 * In languages such as C, compiler will create the executable based on the specific architecture of the CPU - e.g MIPS vs x86 
	 * A classe especifica o corpo do arquivo .java que vai ser compilado pelo Java compiler e transformado no byte-code .class 
	 * que vai se interpretado pela JVM.
	 * A classe contém os objetos e métodos do nosso programa. 
	 */
	public static void main(String[] args) {
		//CORPO DO MÉTODO
		//Método main --> ponto de entrada do programa. Existente em apenas uma class do programa.  
		
		//Ficar atento ao formato da declaração das variáveis: Tipo NOME/ATRIBUTO; Convencoes: sempre letra minuscula, segunda palavra comeca com maiuscula
		//padrao camelCase
		
		//VARIAVEIS DO METODO
		int numero_1; //declaracao apenas
		int numeroUm = 1; //declaracao + inicializacao
		int UM = 1; //tudo maiusculo --> indica constante = variavel que nao sofrera alteracao de valor
		Integer numero_Um = Integer.valueOf(numeroUm); //wrapper integer class
		
		//Formato dos metodos: TipoRetorno NOME_OBJETIVO_NO_INFINITIVO (Parametro(s)) --> metodos NAO PRECISAM ter parametros necessariamente
		//quando o metodo nao retorn nada --> void Nome (Parametro)
		//todo metodo pertence a uma classe especifica e vai atuar nos objetos dessa classe
		//e.g. Strings (sequence of characters) are objects in Java. Java provides the String class with methods to manipulate string objects
		
		String palavra = "R-drig-";
		String novaPalavra = palavra.replace("-", "o");
		
		//--> ATENCAO! Podemos chamar metodos mas nao podemos declarar ou definir metodos dentro de outros; 
		//definicao de metodos devem ser separadas - olhar metodo contarPalavras separado do main
		
		//ATENCAO TOTAL!!!
		System.out.println(palavra); // palavra ainda eh R-drig- --> metodo nao muda o valor da variavel por si mesmo --> tem que haver a retribuicao
		palavra = palavra.replace("-", "o");
		System.out.println(palavra); //palavra eh Rodrigo agora 
		//A ORDEM IMPORTA!!!!!!!
		// = means "get"
	}	

	
	int contarLetras(String palavra) { //Eh mesmo necessario escrever um metodo assim do zero?? NAOOOO! Checar documentacao e ver o que a classe String
									  // ja pode nos oferecer se eu quiser chamar o metodo em algum objeto da classe String. e.g. string.length(); 
		
		//CORPO DO METODO contar letras que vai agir em algum objeto da classe em que o metodo foi declarado - nesse caso EstudandoVariaveis_e_Metodos
		 
		int numeroLetras = 0;   
		
		//Por que variavel local de metodo tem que ser inicializada?
		
		//Detalhe:
		
		int cep = 02134567; //int omite o zero na impressao
		String str_cep = "02134567";
		
		return numeroLetras; //--> metodo retorna um int
		
	}
}
