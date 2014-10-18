package clases;
import java.util.Calendar;
import java.util.Date;
public class CalendarClass {
	public static void main(String[] args) {
		// La Clase Calendar nos permite manipular fechas y horas (Date)
		// Para ello se debe importar la librería java.util.Calendar
		// Se define una nueva fecha actual
		Date d = new Date();
		System.out.println("Fecha inicial\t\t: " + d.toString());
		// Se obtiene una instancia de Calendar
		Calendar cal01 = Calendar.getInstance();
		// se asigna la fecha que se usará
		cal01.setTime(d);
		// Para agregar una hora:
		cal01.add(Calendar.HOUR, 1);
		System.out.println("Agregar una hora\t: " + cal01.getTime().toString());
		// Agregar 5 años, 8 meses y 12 días
		cal01.add(Calendar.YEAR, 5);
		cal01.add(Calendar.MONTH, 8);
		cal01.add(Calendar.DATE, 12);
		System.out
				.println("Agregar 5y 8M 12d\t: " + cal01.getTime().toString());
		// restar 8 años
		cal01.add(Calendar.YEAR, -8);
		System.out.println("Restar 8y\t\t: " + cal01.getTime().toString());
		// Ahora tomar en cuenta el método .roll(). Este método aumenta la
		// unidad que indiquemos pero sin modificar el nivel superior:
		Date d2 = new Date();
		System.out.println("Fecha actual\t: " + d2.toString());		
		// Se declaran dos Calendar para usar los métodos
		Calendar cal02 = Calendar.getInstance();
		Calendar cal03 = Calendar.getInstance();		
		// Se asigna la fecha a ambos
		cal02.setTime(d2);
		cal03.setTime(d2);		
		// Se incrementa 40 días a ambos, uno con .add(), el otro con .roll()
		cal02.add(Calendar.DATE, 40);
		cal03.roll(Calendar.DATE, 40);		
		// verifiquemos que pasa con las fechas
		System.out.println("Con add (+40d)\t\t: " + cal02.getTime().toString());
		System.out.println("Con roll (+40d)\t\t: " +  cal03.getTime().toString());
		// el roll no modificó el mes de octubre.		
		// Calendar contiene constantes que nos sirven para saber los meses, días
		// Saber si el mes actual es octubre
		Date d3 = new Date();
		Calendar cal04 = Calendar.getInstance();
		cal04.setTime(d3);		
		if(cal04.get(Calendar.MONTH) == Calendar.OCTOBER)
			System.out.println("Es octubre");
		else
			System.out.println("No es octubre");
	}
}