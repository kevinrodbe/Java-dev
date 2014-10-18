package gestionFechas;

import java.text.DateFormat;
import java.util.Date;


public class Fecha01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date fecha=new Date();
		DateFormat f1=DateFormat.getDateInstance();
		DateFormat f2=DateFormat.getTimeInstance();
		//Fecha
		DateFormat f3=DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat f4=DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat f5=DateFormat.getDateInstance(DateFormat.FULL);
		
		
		
		//Imprimir
		System.out.println("Fecha y Hora : "+fecha);
		System.out.println("Fecha : "+f1.format(fecha));
		System.out.println("Hora : "+f2.format(fecha));
		System.out.println("Fecha Corta : "+f3.format(fecha));
		System.out.println("Fecha Larga : Lima,"+f4.format(fecha));
		System.out.println("Fecha Completa : "+f5.format(fecha));
		
		
}
}