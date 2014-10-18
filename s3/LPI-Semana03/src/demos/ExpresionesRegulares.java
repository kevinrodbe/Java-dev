package demos;

public class ExpresionesRegulares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejercicios diversos

		String s01 = "123a4";
		// verificar si es un número
		if (s01.matches("[0-9]+"))
			System.out.println("La cadena es un número");
		else
			System.out.println("La cadena no es un número");

		String s02 = "06523412";
		if (s02.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
			System.out.println("La cadena es un DNI (8 dígitos)");
		else
			System.out.println("La cadena no es un DNI (8 dígitos)");
		// Otra forma usando metacaracteres
		if (s02.matches("\\d{8}"))
			System.out.println("Es un DNI");
		else
			System.out.println("No es un DNI");
		
		// verificar si una cadena tiene de 5 a 10 caracteres (alfabetico)
		String s03 = "hola";
		String s04 ="hola mundo";
		String s05 = "párrafo en java";

		System.out.println(s03.matches("\\D{5,10}"));
		System.out.println(s04.matches("\\D{5,10}"));
		System.out.println(s05.matches("\\D{5,10}"));
		
		// Validaciones
		System.out.println("U0001".matches("\\S\\d{1,4}"));
		System.out.println("A0078".matches("\\S\\d{1,4}"));
		System.out.println("X01".matches("\\S\\d{1,4}"));
		System.out.println("y1".matches("\\S\\d{1,4}"));
		System.out.println(" 01".matches("\\S\\d{1,4}"));
		System.out.println("U0001784".matches("\\S\\d{1,4}"));
		
		// Validacion: AZ-4514 (dos letras)guion(4digitos)
		System.out.println("AZ-4514".matches("[A-Z]{2}-\\d{4}"));
		System.out.println("89-5676".matches("[A-Z]{2}-\\d{4}"));
		System.out.println("76-AFRR".matches("[A-Z]{2}-\\d{4}"));
		System.out.println("13-SVM".matches("[A-Z]{2}-\\d{4}"));
		System.out.println("02-0496".matches("[A-Z]{2}-\\d{4}"));
		System.out.println("SV1313".matches("[A-Z]{2}-\\d{4}"));
		
		// Validacion: (1-3digitos)guion(2letras)
		System.out.println("4-GF".matches("\\d{1,3}-[A-Z]{2}"));
		System.out.println("89-SV".matches("\\d{1,3}-[A-Z]{2}"));
		System.out.println("249-MM".matches("\\d{1,3}-[A-Z]{2}"));
		System.out.println("249-MNO".matches("\\d{1,3}-[A-Z]{2}"));
		
		// Validacion: (2letrasy2digitos) o (2digitos y 2letras)
		System.out.println("DC-41".matches("(\\d{2}-[A-Z]{2})|([A-Z]{2}-\\d{2})"));
		System.out.println("41-DC".matches("(\\d{2}-[A-Z]{2})|([A-Z]{2}-\\d{2})"));
		
		// Validacion: Mayusculas y minusculas
		System.out.println("Ab".matches("[A-Za-z]{2}"));
		System.out.println("yY".matches("[A-Za-z]{2}"));
		

	}

}
