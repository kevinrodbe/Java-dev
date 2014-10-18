package gestionFechas;

import java.util.Calendar;

public class Fechas3 {

	
	public static void main(String[] args) {
		
		Calendar f1=Calendar.getInstance();
		f1.set(2013, 1,31);
		Calendar f2=Calendar.getInstance();
		f2.set(2013, 1,30);
		
		if(f1.after(f2))
			System.out.println("Mayor");
		else
			System.out.println("Menor");
		
		if(f1.before(f2))
			System.out.println("Mayor");
		else
			System.out.println("Menor");

	}

}
