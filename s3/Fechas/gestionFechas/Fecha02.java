package gestionFechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date fecha=new Date();
		SimpleDateFormat f1=new SimpleDateFormat("hh:mm:ss a");
		SimpleDateFormat f2=new SimpleDateFormat("kk:mm:ss a");
		SimpleDateFormat f3=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat f4=new SimpleDateFormat("'Lima' EEEE dd 'de' MMMM 'de' yyyy");
		
		System.out.println("Hora(1-12) : "+f1.format(fecha));
		System.out.println("Hora(1-24) : "+f2.format(fecha));
		System.out.println("Fecha : "+f3.format(fecha));
		System.out.println("Fecha Completa: "+f4.format(fecha));
		

	}

}
