package gestionFechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String xfecha="24/12/2012";
			SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
			Date fecha=f1.parse(xfecha);
			System.out.println(f1.format(fecha));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
