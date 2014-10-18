package clases;
public class Cuantificadores {
	public static void main(String[] args) {
		// En expresiones regulares podemos usar cuantificadores para determinar
		// si un caracter cumple con determinada tipo o se encuentra en un rango
		// de caracteres
		// El más usado es [], el cual representa a un caracter
		// El caracter (la cadena) cumple con el patrón, en este caso que se
		// encuentre en el rango de 0-9
		System.out.println("1".matches("[0-9]"));
		// En este caso se verifica si la cadena "1" cumple con el patrón del
		// rango 5-9
		System.out.println("1".matches("[5-9]"));
		// En este caso se verifica si la cadena "123" cumple con el patrón que
		// represente a un solo caracter en el rango de 0-9
		System.out.println("132".matches("[0-9]"));
	}
}