package gestionFechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String xfecha1="24/12/2012";
			String xfecha2="30/12/2012";
			SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
			Date fecha1=f1.parse(xfecha1);
			Date fecha2=f1.parse(xfecha2);
			if(fecha1.after(fecha2))
				System.out.println("Fecha 1 despues de Fecha 2");
			else
				System.out.println("Fecha 1 antes de Fecha 2");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
