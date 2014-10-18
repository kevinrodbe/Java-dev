package gestionFechas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas6 {

	public static void main(String[] args) {
		// Obtenemos fecha y hora del sistema
		Date fechaHoy=new Date();  // Ver import arriba java.util.Date
		System.out.println("Fecha Actual : "+fechaHoy);
		
		// Definimos formatos de fecha
		SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yy");
		SimpleDateFormat f2=new SimpleDateFormat("EEE/dd/MMMM/yyyy");
		SimpleDateFormat f3=new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy");
		System.out.println("Formato 1: "+f1.format(fechaHoy));
		System.out.println("Formato 2: "+f2.format(fechaHoy));
		System.out.println("Formato 3: "+f3.format(fechaHoy));
		
		// Otra forma de obtener fecha y hora del sistema
		// Calendar es una clase abstracta, por lo que no se puede instanciar o crear
		// objetos con "new". En su lugar está el método getInstance() para crear ojjetos
		Calendar fechaActual=Calendar.getInstance();
		System.out.println("Fecha Actual : "+fechaActual);
		
		System.out.println("Día del Mes : "+fechaActual.get(Calendar.DAY_OF_MONTH));
		// En el calendario Gregoriano la semana empieza en Domingo, así:
		// 1-->Domingo  2-->Lunes  3-->Martes  4-->Miercoles.etc
		System.out.println("Día de la Semana : "+fechaActual.get(Calendar.DAY_OF_WEEK));
		// En el calendario Gregoriano el mes Enero --> 0, Febrero --> 1, Marzo --> 2, etc
		System.out.println("Mes : "+fechaActual.get(Calendar.MONTH));
		System.out.println("Año : "+fechaActual.get(Calendar.YEAR));
		//System.out.println("Día del Mes : "+fechaActual.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora (12 Horas) : "+fechaActual.get(Calendar.HOUR));
		System.out.println("Hora (24 Horas) : "+fechaActual.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos : "+fechaActual.get(Calendar.MINUTE));
		System.out.println("Segundos : "+fechaActual.get(Calendar.SECOND));
		
		// Otra forma de definir formatos prestablecidos
		// Ojo. La fecha tiene que ser Date (Luego ver la clase Fechas1)
		DateFormat f4=DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat f5=DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat f6=DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat f7=DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println("Fecha Actual : "+f4.format(fechaHoy));
		System.out.println("Fecha Actual : "+f5.format(fechaHoy));
		System.out.println("Fecha Actual : "+f6.format(fechaHoy));
		System.out.println("Fecha Actual : "+f7.format(fechaHoy));
		
						
	}

}



