package demos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comparacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// En esta clase, se compararán fechas

		// Según las siguientes fechas, cual es la mayor?
		String s1 = "02-04-1996";
		String s2 = "01-03-2013";
		String s3 = "05-10-2014";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			Date d1 = sdf.parse(s1);
			Date d2 = sdf.parse(s2);
			Date d3 = sdf.parse(s3);

			// Se comparan las fechas con el metodo .after() de la clase Date
			if(d1.after(d2) && d1.after(d3))
				System.out.println("Fecha mayor\t: " + sdf.format(d1));
			
			if(d2.after(d1) && d2.after(d3))
				System.out.println("Fecha mayor\t: " +  sdf.format(d2));
			
			if(d3.after(d1) && d3.after(d2))
				System.out.println("Fecha mayor\t: " +  sdf.format(d3));
			
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
