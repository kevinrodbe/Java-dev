package clases;
import java.util.Date;
public class DateClass {
	public static void main(String[] args) {
		// En esta clase se mostrará el uso de la Clase Date
		// Para ello se importa la clase: java.util.Date
		// La fecha base de Date es: 01/01/1970
		Date d = new Date();
		System.out.println("Fecha actual\t: " + d.toString());
		// La clase date se basa en milisegundos:
		System.out
				.println("Milisegundos desde la fecha base\t: " + d.getTime());
		// Se agrega un trillón de milisegundos a la fecha base:
		// 1000000000000L equivale a 31 2/3 años
		Date d2 = new Date(1000000000000L);
		System.out.println("Agregando un trillón de ms\t: " + d2.toString());
		// La clase Date no cuenta con métodos para agregar horas, días, etc, ni
		// para comparar fechas.
		// Por ejemplo, si quisieramos agregar una hora a la fecha actual, se
		// tendría que hacer algo como lo siguiente:
		// una hora equivale a 3600000 milisegundos
		Date d3 = new Date();
		System.out.println("Fecha y hora actual\t: " + d3.toString());
		d3.setTime(d3.getTime() + 3600000);
		System.out.println("Se agrega una hora\t: " + d3.toString());
	}
}