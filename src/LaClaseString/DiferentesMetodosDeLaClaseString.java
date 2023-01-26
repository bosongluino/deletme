package LaClaseString;

/* ver video
  Curso Java - 11: Métodos de Clase String
  Códigos de Programación - MR
*/


public class DiferentesMetodosDeLaClaseString {

	public static void main(String[] args) {
		
		Punto puntoFino;
//		System.out.println(puntoFino);
		String cadena1;
//		System.out.println("cadena1" + cadena1);
	    cadena1= "Java es el mejor lenguaje de programacion";
		System.out.println("contenido de cadena1: " + cadena1);
		String cadena2;
//		System.out.println("cadena12 " + cadena12);
		cadena2 = "Me gusta python";
		System.out.println("contenido de cadena12: " + cadena2);
		String cadena3;
//		System.out.println("cadena13" + cadena13);
		cadena3 = "Me gusta python";
		System.out.println("contenido de cadena13: " + cadena3);
		
		
//el metodo length nos indica la longitud de la cadena1.  retorna un entero, luego 
		int longitud = cadena1.length();
		System.out.println("la cadena1 tiene una longitud de " + longitud + " caracteres");
		
//el metodo substring nos devuelve el fragmento de cadena1 que le indiquemos. Luego retorna un String
		String fragmento = cadena1.substring(11, 16);
		System.out.println("la palabra " + fragmento + ": es parte del contenido de la variable cadena1");
/* 
 * a la m le corresponde el 11 contando desde cero, pero a la r le corresponde el 16(una unidad mas)  		
 */
		
//el metodo toUpperCase convierte toda la cadena1(frase) a mayusculas
//De forma analoga funciona toLowerCase convierte toda la cadena1 a minusculas
		
		String mayusculas = cadena1.toUpperCase();
		System.out.println("frase en mayusculas: " + mayusculas);
		
//el metodo equals compara el contenido de las cadena1s, por lo tanto devuelve un booleano
		boolean comparar = cadena2.equals(cadena1);
		System.out.println("comparando dos cadenas con diferente contenido con equals   " + comparar);
		
		boolean comparar2 = cadena3.equals(cadena2);
		System.out.println("comparando dos cadenas de igual contenido con equals   " + comparar2);
		
		boolean comparar3 = cadena2 == cadena3;
		System.out.println("comparando dos cadenas de igual contenido con ==   " + comparar3);
		}
}
