package aula7.parte1.enums;

public enum TimesCariocas {
	FLUMINENSE("FLU"),
	FLAMENGO ("FLA"),
	BOTAFOGO ("BOT"),
	VASCO ("VAS");
	
	private String sigla; //variavel/atributo da classe que estarao presentes nos objetos acima
	
	private TimesCariocas(String sigla) {
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return this.sigla;
	}
		
}
