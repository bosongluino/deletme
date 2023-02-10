package pruebas;

import java.util.Random;

public class PruebasRandom {

	public static void main(String[] args) {

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
}
