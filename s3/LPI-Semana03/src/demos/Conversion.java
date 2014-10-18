package demos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Conversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// En esta clase veremos como convertir una cadena String a un objeto
		// fecha Date

		String s = "02-04-1996";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		/*
		 * .parse() : String -> Date .format(): Date -> String
		 */

		try {
			// Se convierte del String a Date (se indica el formato)
			Date d = sdf.parse(s);

			System.out.println(d.toString());

			// Se verifica aumentando la fecha
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			cal.add(Calendar.DATE, 50);

			// Se obtiene la nueva fecha
			Date d2 = cal.getTime();
			System.out.println(d2.toString());

			// .format tambien devuelve la fecha como cadena en el formato
			// definido
			System.out.println(sdf.format(d2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
