package demos;

public class Tokens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejercicio de Tokens y delimitadores usando metacaracteres y
		// cuantificadores
		
		// Separar el texto encriptado
		String cadena = "HolaS1VaI8Etodos.K4FEsteC6ZesS2ZtextoI9Hoculto";
		String resultado = cadena.replaceAll("[A-Z]\\d[A-Z]", " ");
		System.out.println(resultado);
		
		// Tokens
		String encriptado = "HolaS1VaI8Etodos.K4FEsteC6ZesS2ZtextoI9Hoculto";
		String[] tokens = encriptado.split("[A-Z]\\d[A-Z]");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}

	}

}
