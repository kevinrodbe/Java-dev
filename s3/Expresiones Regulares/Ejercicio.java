package regular;

public class Ejercicio {

	
	
	public static void main(String[] args) {

		//Si es un digito
		System.out.println("1".matches("\\d"));
		System.out.println("132".matches("\\d"));
		
		System.out.println("1".matches("[0-9]"));
		System.out.println("132".matches("[0-9]"));
		
		//Si es un DNI
		System.out.println("12314525".matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"));
		System.out.println("12314525".matches("\\d{8}"));
		
		//Numero
		System.out.println("12".matches("\\d+"));
		System.out.println("12".matches("[0-9]+"));
		
		//Texto de 5 a 10
		System.out.println("ab".matches("\\D{5,10}"));
		System.out.println("abc defg".matches("\\D{5,10}"));
		System.out.println("abc def gHIJKLM".matches("\\D{5,10}"));
		
		//Validacion
		//U0001, A0078, X01, y1
		
		System.out.println("U0001".matches("\\S\\d{1,4}"));//true
		System.out.println("A0078".matches("\\S\\d{1,4}"));//true
		System.out.println("X01".matches("\\S\\d{1,4}"));//true
		System.out.println("y1".matches("\\S\\d{1,4}"));//true
		System.out.println(" 01".matches("\\S\\d{1,4}"));//false
		System.out.println("U0001784".matches("\\S\\d{1,4}"));//false
		
		//Validacion
		//AZ-4514,CD-4514
		System.out.println("AZ-4514".matches("\\D{2}-\\d{4}"));//true
		System.out.println("CD-4514".matches("\\D{2}-\\d{4}"));//true
		System.out.println("89-4514".matches("\\D{2}-\\d{4}"));//false
		System.out.println("89-ABCD".matches("\\D{2}-\\d{4}"));//false
		System.out.println("89-787".matches("\\D{2}-\\d{4}"));//false
		System.out.println("AB7842".matches("\\D{2}-\\d{4}"));//false
		
		
		
		
	}

}
