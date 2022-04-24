package aula_6_parte1$OOP_ClassesObjetosConstrutores;

//classe Aviao que vai especificar os atributos e metodos dos objetos pertencentes a ela.
//A classe serve como molde para a criacao de objetos -> Com essa classe queremos possibilitar a criacao de objetos que representem avioes no mundo real
//para podermos criar nosso Aeroporto


public class Aviao { 
	//Atributos que todos os objetos da classe Aviao terao
	String modelo;
	String construtora;
	String companhiaAerea;
	
	//Metodo Construtor = metodo especial da nossa classe usado somente durante a criacao dos objetos dessa classe
	//especifica padroes ou informacoes essenciais para a criacao desses objetos
	//Quando projetamos uma aplicacao, queremos que os objetos criados dentro dela sigam alguns requisitos desde o momento de sua criacao, 
	//deixando tudo mais organizado
	//ESSENCIAL PARA UM AVIAO EXISTIR: modelo + construtora; o veiculo aviao pode estar ou nao associado a alguma companhia aerea
	Aviao(String modelo, String construtora){
		this(modelo, construtora, "N/A"); //Construtor chamando o outro --> DUVIDA: O construtor que eh chamado eh sempre o que tem mais parametros?
	}
	
	Aviao(String modelo, String construtora, String companhiaAerea){
		this.modelo = modelo;
		this.construtora = construtora;
		this.companhiaAerea = companhiaAerea;
	
	//Esses dois construtores sao exemplos de metodos sobrecarregados --> duas maneiras de chamar o mesmo metodo: uma com mais e outra com menos parametros
	}
	
}
