package clases;

public class Metacaracteres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Los metacaracteres representan un "atajo" en representaci�n de
		// determinados patrones:

		// \w Cualquier car�cter alfanum�rico, incluyendo el gui�n bajo
		// \W Cualquier car�cter que no sea alfanum�rico
		// \d Cualquier d�gito
		// \D Cualquier car�cter que no sea d�gito
		// \s Cualquier car�cter que represente espacio en blanco, o nueva l�nea
		// \S Cualquier car�cter excepto que representa espacio en blanco
		
		// Es un d�gito?
		System.out.println("1".matches("\\d"));
		System.out.println("a".matches("\\d"));
		System.out.println("a".matches("\\D"));
		System.out.println("1".matches("\\D"));
		
		System.out.println("_".matches("\\w"));
		System.out.println("a".matches("\\w"));
		System.out.println("$".matches("\\w"));
		System.out.println("$".matches("\\W"));
		
		System.out.println(" ".matches("\\s"));
		System.out.println(" ".matches("\\S"));

	}

}
