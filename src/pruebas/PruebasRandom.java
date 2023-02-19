package pruebas;

import java.util.Random;

public class PruebasRandom {

	public static void main(String[] args) {

		Random generator = new Random(3);
		generator.setSeed(12345L);
		System.out.println("numero aleatorio repetido: ");
		
		System.out.println("numero entero: " + generator.nextInt());
		System.out.println("numero long: " + generator.nextFloat());
		
		int numberRandom = (int) (Math.random() * 100);
		System.out.println(numberRandom);

		int contador = 0;
		System.out.println("\ngenera un numero aleatorio entre 3 y 10");
		do {
			contador++;
			Random number = new Random();
			int randomNum = number.nextInt(8);
			System.out.println(randomNum + 3);

		} while (contador < 5);
	}
//	public synchronized void setSeed(long seed)
}
