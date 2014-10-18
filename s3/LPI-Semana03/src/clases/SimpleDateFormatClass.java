package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// La clase SimpleDateFormat permite crear formatos personalizados, as�
		// como usar determinadas constantes para obtener ciertos valores de una
		// fecha (Date)

		Date d = new Date();

		// Se debe importar la clase java.text.SimpleDateFormat

		// Formato HH:mm:ss
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf1.format(d));

		// Formato HH.mm.ss
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH.mm.ss");
		System.out.println(sdf2.format(d));

		// HH: Horas
		// mm: minutos
		// ss: segundos
		// yyyy: a�o
		// MMMM: mes

		// Formato: Nombre completo del mes, a�o (MMMM, yyyy)
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMMM, yyyy");
		System.out.println(sdf3.format(d));

		// Formato: numero del mes, ult digitos del a�o (MM, yy)
		SimpleDateFormat sdf4 = new SimpleDateFormat("MM, yy");
		System.out.println(sdf4.format(d));

		// Formato: HH a (am o pm)
		SimpleDateFormat sdf5 = new SimpleDateFormat("HH a");
		System.out.println(sdf5.format(d));

		// Obtener el n�mero de la semana del a�o: w
		SimpleDateFormat sdf6 = new SimpleDateFormat("'# de la semana ': w");
		System.out.println(sdf6.format(d));

		// Obtener el a�o y sus �ltimos d�gitos
		SimpleDateFormat sdf7 = new SimpleDateFormat(
				"'El a�o' y 'termina en 'yy");
		System.out.println(sdf7.format(d));

		// Nombre completo del d�a, n�mero del d�a, nombre de mes, a�o
		SimpleDateFormat sdf8 = new SimpleDateFormat(
				"EEEE',' dd 'de' MMMM 'del' y");
		System.out.println(sdf8.format(d));

		// Numero del d�a del a�o
		SimpleDateFormat sdf9 = new SimpleDateFormat(
				"'Han transcurrido' D 'd�as del' y");
		System.out.println(sdf9.format(d));

	}

}
