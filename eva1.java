/* 	Equals compara os valores
	== Compara a la variable en el HD
*/
StringBuilder sbd = new StringBuilder();
sbd.append("lorem..");
SOUT(sbd.toString());
sbd.reverse().toString();// La cadena al revés:
StringBuffer sbf = new StringBuffer();
sbf.append("lorem..");
SOUT(sbf.toString());
/*************************
		FECHA 
*************************/
import java.util.Calendar;
import java.util.Date;
Date d = new Date();// Se obtiene una instancia de Calendar
SOUT(d.toString());
Calendar cal01 = Calendar.getInstance();// se asigna la fecha que se usará
cal01.setTime(d);
cal01.add(Calendar.HOUR, 1);// Para agregar una hora:
SOUT(cal01.getTime().toString());
cal02.add(Calendar.DATE, 40); // 04/04/1993
cal03.roll(Calendar.DATE, 40); // 02/02/1993
if(cal04.get(Calendar.MONTH) == Calendar.OCTOBER)
/* 	La clase date se basa en milisegundos:
	La clase Date no cuenta con métodos para agregar horas, días, etc, ni
	para comparar fechas.*/
Date d3 = new Date();
d3.toString();//fecha actual
d3.setTime(d3.getTime() + 3600000);
/* DateFormatClass */
/*	clase abstracta que permite dar formato a Fechas y Horas. */
java.text.DateFormat;
Date d = new Date();
DateFormat df1 = DateFormat.getDateInstance(); // Se obtiene una instancia de DateFormat  con el formato por defecto
DateFormat df2 = DateFormat.getTimeInstance(); // Hora
DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT); // fecha dd/mm/aa
DateFormat df4 = DateFormat.getDateInstance(DateFormat.MEDIUM); // fecha dd/mm/aaaa
DateFormat df5 = DateFormat.getDateInstance(DateFormat.LONG); // dd de m.. de aaaa
DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL); // d.. de m.. de aaaa
df6.format(d) // imprimir
/*************************
		Locale Class 
*************************/
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
Date d = new Date();
DateFormat df1 = DateFormat.getInstance(); // dd/mm/aaaa hh:mm pm
DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL); // d.. dd de m.. de aaaa
// idioma italiano
Locale locIT = new Locale("it", "IT");
DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIT);
// portugues para portugal y brasil
Locale locPT = new Locale("pt");
DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locPT);
// portugues de brasil
Locale locPTBR = new Locale("pt", "BR");
DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, locPTBR);
// Locale: FR/EN/UK cambiar por el idioma que quieres
DateFormat df8 = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRENCH);
df6.format(d);
/*************************
	Formatos personalizados 
*************************/
import java.text.SimpleDateFormat;
import java.util.Date;
Date d = new Date();
SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss"); 
SimpleDateFormat sdf2 = new SimpleDateFormat("HH.mm.ss");
("MMMM, yyyy");("MM, yy");("HH a") // 18 pmp;
SimpleDateFormat sdf6 = new SimpleDateFormat("'# de la semana ': w");
SimpleDateFormat sdf7 = new SimpleDateFormat("'El año' y 'termina en 'yy"); // 2014 t 14 oee
SimpleDateFormat sdf8 = new SimpleDateFormat("EEEE',' dd 'de' MMMM 'del' y"); // d.., dd de m.. del aaaa
SimpleDateFormat sdf9 = new SimpleDateFormat("'Han transcurrido' D 'días del' y"); // 360 días del 2014
System.out.println(sdf8.format(d));
/*************************
		Monedas 
*************************/
import java.text.NumberFormat;
import java.util.Locale;
float f = 12354.46876f; //  # de prueba
NumberFormat nf1 = NumberFormat.getInstance();
nf1.format(f);
// france, us, 
NumberFormat nf2 = NumberFormat.getInstance(Locale.FRANCE)
nf2.format(f); // imprime a todos oee
nf1.setMaximumFractionDigits(4); // con 4 decimales
NumberFormat nf4 = NumberFormat.getIntegerInstance(); // solo enteros
// Para el manejo de monedas .getCurrencyInstance()
NumberFormat nf5 = NumberFormat.getCurrencyInstance(); // default
// france, us
NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
/*************************
		Tokens 
*************************/
String s = "a,1,44,55,66A66,e34,2 3,3454";
String[] tokens = s.split(","); // La "," será el delimitador
for (int i = 0; i < tokens.length; i++) {
	if(tokens[i].matches("\\d+"))
		System.out.println(tokens[i]);
}
/* ************************
	Buscar en cadenas 
*************************/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Patrón: ab
Pattern p = Pattern.compile("ab");
// Origen: abaaaba
Matcher m = p.matcher("abaaaba");
//Obtener los índices dónde aparezca el patrón
while (m.find()) {
	System.out.println(m.start() + " ");
}
// a b a a a b a
// 0 1 2 3 4 5 6
// La cadena a buscar "ab" aparece en los índices 0 y 4
/***************************
		METAcaracteres
****************************/
// \w Cualquier carácter alfanumérico, incluyendo el guión bajo
// \W Cualquier carácter que no sea alfanumérico
// \d Cualquier dígito
// \D Cualquier carácter que no sea dígito
// \s Cualquier carácter que represente espacio en blanco, o nueva línea
// \S Cualquier carácter excepto que representa espacio en blanco
SOUT("1".matches("\\d"));// true
SOUT("a".matches("\\d"));// false
SOUT("a".matches("\\D"));// true
SOUT("1".matches("\\D"));// false

SOUT("_".matches("\\w"));// true
SOUT("a".matches("\\w"));// true
SOUT("$".matches("\\w"));// false
SOUT("$".matches("\\W"));// true

SOUT(" ".matches("\\s"));// true
SOUT(" ".matches("\\S"));// false
/***************************
		Cuantificadores
****************************/
// El más usado es [], el cual representa a un caracter
// El caracter (la cadena) cumple con el patrón, en este caso que se
// encuentre en el rango de 0-9
System.out.println("1".matches("[0-9]")); // true
// En este caso se verifica si la cadena "1" cumple con el patrón del
// rango 5-9
System.out.println("1".matches("[5-9]")); // false
// En este caso se verifica si la cadena "123" cumple con el patrón que
// represente a un solo caracter en el rango de 0-9
System.out.println("132".matches("[0-9]")); // false