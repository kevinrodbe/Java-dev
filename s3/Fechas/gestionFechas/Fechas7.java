package gestionFechas;
import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas2 {

	
	public static void main(String[] args) {
	
	
	 
	// Si tenemos un Calendar, es necesario convertirlo a Date para aplicar 
	// los formatos preestablecidos de DateFormat
		
	Calendar fechaActual=Calendar.getInstance();
	
	// Convetimos un Calendar a Date
	Date fechaHoy=fechaActual.getTime();
	
	// Aplicamos formatos
	DateFormat f1=DateFormat.getDateInstance(DateFormat.FULL);
	// Lo siguiente no EJECUTA porque la fecha es tipo Calendar
	// System.out.println("Fecha Actual : "+f1.format(fechaActual));
	
	System.out.println("Fecha Actual : "+f1.format(fechaHoy));
	
	// Asignando una fecha particular a un Calendar
	Calendar fechaIngreso=Calendar.getInstance();
	fechaIngreso.set(2007, 9, 15);
	SimpleDateFormat sdf1=new SimpleDateFormat("EEEE/dd/MMMM/yyyy");
	System.out.println("Fecha de Ingreso : "+sdf1.format(fechaIngreso.getTime()));
	
	//Si tebemos una fecha en String, lo podemos convertir a Date
	String fecha="15/05/73";
	
	try {
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yy");
		Date fechaNac=sdf2.parse(fecha);
		
		System.out.println("Fecha convertida : "+sdf2.format(fechaNac));
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	// Covertimos un Date a Calendar, para aplicar los métodos get
	Date fechaInicio=new Date();
	Calendar c=Calendar.getInstance();
	c.setTime(fechaInicio);
	
	System.out.println("Día : "+c.get(Calendar.DAY_OF_MONTH) );	
	System.out.println("Mes : "+c.get(Calendar.MONTH) );
	System.out.println("Año : "+c.get(Calendar.YEAR) );
	
	}

}






