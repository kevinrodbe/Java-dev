package clases;

public class Metacaracteres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Los metacaracteres representan un "atajo" en representación de
		// determinados patrones:

		// \w Cualquier carácter alfanumérico, incluyendo el guión bajo
		// \W Cualquier carácter que no sea alfanumérico
		// \d Cualquier dígito
		// \D Cualquier carácter que no sea dígito
		// \s Cualquier carácter que represente espacio en blanco, o nueva línea
		// \S Cualquier carácter excepto que representa espacio en blanco
		
		// Es un dígito?
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
