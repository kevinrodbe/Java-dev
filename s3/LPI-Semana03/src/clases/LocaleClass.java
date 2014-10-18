package clases;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// La clase Locale representa una ubicaci�n geografica.
		// Por lo general se determina por un c�digo de idioma (2 o 3
		// caracteres)
		// o c�digo de idioma pa�s.
		// Ejemplo: es (idioma espa�ol)
		// Ejemplo: es-PE (idioma espa�ol-pa�s Per�)
		// es-MX (idioma espa�ol-pa�s M�xico)

		// De esta forma se puede obtener el formato de cada configuraci�n
		// regional

		Date d = new Date();

		// Locale por defecto
		DateFormat df1 = DateFormat.getInstance();
		System.out.println("Locale por defecto\t: " + df1.format(d));

		// Locale por defecto y completo
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Locale por defecto (FULL)\t: " + df2.format(d));

		// Locale con idioma italiano (it-IT)
		Locale locIT = new Locale("it", "IT"); // Italy
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Locale it-IT\t\t: " + df3.format(d));

		// Un idioma puede ser usado en distintos pa�ses y el formato incluso
		// var�a. Tomemos el ejemplo del portugu�s, tanto de Brasil y Portugal
		
		// Locale: pt
		Locale locPT = new Locale("pt");
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locPT);
		System.out.println("Locale pt\t\t: " +  df4.format(d));
		
		// Locale: pt-BR
		Locale locPTBR = new Locale("pt", "BR");
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, locPTBR);
		System.out.println("Locale pt-BR\t\t: " + df5.format(d));
		
		// Locale: hi-IN
		Locale locIN = new Locale("hi", "IN");
		DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, locIN);
		System.out.println("Locale hi-IN\t\t: " +  df6.format(d));
		
		// Locale: ja
		Locale locJA = new Locale("ja");
		DateFormat df7 = DateFormat.getDateInstance(DateFormat.FULL, locJA);
		System.out.println("Locale ja\t\t: " + df7.format(d));
		
		// Locale: FR
		DateFormat df8 = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRENCH);
		System.out.println("Locale FR\t\t: " + df8.format(d));

		// Locale: EN
		DateFormat df9 = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
		System.out.println("Locale ENGLISH \t\t: " + df9.format(d));
		
		// Locale: UK
		DateFormat df10 = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
		System.out.println("Locale UK\t\t: " + df10.format(d));
	}

}
