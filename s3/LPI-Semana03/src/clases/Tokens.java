package clases;

public class Tokens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// En una cadena se pueden usar delimitadores para separar diversos
		// valores (tokens)
		
		// Se define la fuente (cadena):
		String s = "a,1,44,55,66A66,e34,2 3,3454";
		
		// Usaremos el delimitador "," para obtener los tokes
		String[] tokens = s.split(",");
		
		for (int i = 0; i < tokens.length; i++) {
			if(tokens[i].matches("\\d+"))
				System.out.println(tokens[i]);
		}

	}

}
