package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Para realizar b�squedas en una cadena, se puede hacer uso de
		// expresiones regulares. Para esto se define un patr�n (qu� buscar) y
		// un origen (cadena)
		
		// Patr�n: ab
		Pattern p = Pattern.compile("ab");
		
		// Origen: abaaaba
		Matcher m = p.matcher("abaaaba");
		
		//Obtener los �ndices d�nde aparezca el patr�n
		while (m.find()) {
			System.out.println(m.start() + " ");
		}
		
		// a b a a a b a
		// 0 1 2 3 4 5 6
		// La cadena a buscar "ab" aparece en los �ndices 0 y 4

	}

}
