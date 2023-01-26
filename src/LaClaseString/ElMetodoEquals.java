package LaClaseString;

public class ElMetodoEquals {

	public static void main(String[] args) {
		
//A continuacion se utilizara el metodo equals para comparar cadenas
		
		String texto = "casa";
		String texto2 = "casa";
		String word1 = "apto";
		String word2 = "zebra";
		
//puesto que el metodo equals retorna verdadero o falso(es decir un booleano) debemos declarar
// una variable de tipo booleano
		
		boolean comparacion;
		comparacion = texto2.equals(texto);
		if (comparacion)
			System.out.println("Las cadenas son iguales");
		else
			System.out.println("las cadenas son diferentes");
		
		boolean comparacion2;
		comparacion2 = texto == texto2;
		if (comparacion2)
			System.out.println("Las cadenas son iguales");
		else
			System.out.println("las cadenas son diferentes");
	
/*notese como no son necesarias las llaves en if y else puesto que acontinuacion se tiene
  una sola linea de codigo.
  
 A continuacion comparamos dos textos los cuales no pertenecen a la clase String sino a una clase
 creada por el programador  
*/
	Punto p = new Punto(60);
	Punto q = new Punto(60);
	
	boolean comparacion3;
	comparacion3 = p.equals(q);
	
	if (comparacion3)
		
		System.out.println("Los puntos p y q son los mismos");
	else
		System.out.println("los puntos p y q son diferentes");		
/* 
 * Al ejecutar el programa el resultado es que los puntos son diferentes. Esto se debe a que los "objetos" p y q
 * no son identicos. Sin embargo los puntos p y q son iguales puesto que (sus argumentos son las mismas, el valor 
 * de 60). Para que dos objetos sean identicos implica que son el mismo objeto.Cuando a una variable se le asigne 
 * un nuevo valor este se reescribe , pero el objeto no es el mismo es diferente.   
 * Para que los objetos p y q sean identicos de debe declarar la sentencia p = q. 
 * cuando p = q ahora los dos objetos no solo son iguales sino que son identicos, es decir son el mismo objeto.
 * */
	
//Ahora utilizando el metodo compareTo de la clase String
	System.out.println(texto.compareTo(texto2));
	System.out.println(word1.compareTo(word2));
	
	
	}
	
}
