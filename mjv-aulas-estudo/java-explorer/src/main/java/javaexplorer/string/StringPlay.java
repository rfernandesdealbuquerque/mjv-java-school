package javaexplorer.string;

public class StringPlay {
	
	public static String concatenarString(String str, int repeticoes) {
		
		String s = "";
		int k = 0;
		while (k<repeticoes ) {
			s = str + s;
		}
		
		return s;
	}

}
