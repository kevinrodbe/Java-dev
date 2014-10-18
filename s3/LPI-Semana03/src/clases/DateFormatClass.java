package clases;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// La clase DateFormat es una clase abstracta que permite dar formato a
		// Fechas y Horas. Para ello se importa la clase java.text.DateFormat

		Date d = new Date();

		// Se obtiene una instancia de DateFormat con el formato por defecto
		DateFormat df1 = DateFormat.getDateInstance();
		System.out.println("Fecha\t\t: " + df1.format(d));
		
		// Se muestra la hora con el formato por defecto
		DateFormat df2 = DateFormat.getTimeInstance();
		System.out.println("Hora\t\t: " + df2.format(d));
		
		// Formato de fecha corta
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Fecha (SHORT)\t: " + df3.format(d));
		
		// Formato de fecha mediana
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Fecha (MEDIUM)\t: " + df4.format(d));
		
		// Formato de fecha larga
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Fecha (LONG)\t: " +  df5.format(d));
		
		// Formato de fecha completa
		DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Fecha (FULL)\t: " + df6.format(d));

	}

}
