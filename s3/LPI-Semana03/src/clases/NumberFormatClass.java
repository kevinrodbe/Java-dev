package clases;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// La clase NumberFormat permite mostrar el formato de valores del tipo
		// numérico y de monedas. También soporta la configuración regional
		// basada en idioma o idioma-país (Locale)
		// Se debe importar la librería java.util.NumberFormat

		// Se define un float (en este caso con 5 decimales)
		float f = 12354.46876f;

		// Formato de número por defecto
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println("Formato por defecto\t: " + nf1.format(f));
		// Nos percatamos que el formato por defecto solo muestra 3 decimales
		// ademas usa la coma "," como separador decimal y el punto como
		// separador de miles

		// Usando Locale.FRANCE
		NumberFormat nf2 = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println("Formato (FRANCE)\t: " + nf2.format(f));
		// El separador de miles es un espacio en blanco y el separador de
		// decimal es la coma

		// Usando Locale.US
		NumberFormat nf3 = NumberFormat.getInstance(Locale.US);
		System.out.println("Formato (US)\t\t: " + nf3.format(f));
		// El separador de miles es la coma y el separador de decimales es el
		// punto

		// Se realiza el cambio de maximo de digitos decimales a mostrar. Por
		// ejemplo 4 decimales
		nf1.setMaximumFractionDigits(4);
		System.out.println("Con 4 decimales\t\t: " + nf1.format(f));
		
		// Para solo obtener la porción de enteros
		NumberFormat nf4 = NumberFormat.getIntegerInstance();
		System.out.println("La parte entera es\t: " +  nf4.format(f));
		
		
		// Para el manejo de monedas, se debe usar .getCurrencyInstance()
		NumberFormat nf5 = NumberFormat.getCurrencyInstance();
		System.out.println("Moneda por defecto\t: " +  nf5.format(f));
		
		// Moneda con Locale FRANCE
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("Moneda (FRANCE)\t\t: " + nf6.format(f));
		
		// Moneda con Locale US
		NumberFormat nf7 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Moneda (US)\t\t: " + nf7.format(f));
	}

}
