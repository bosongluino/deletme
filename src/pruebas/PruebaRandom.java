package pruebas;

import java.util.Random;

public class PruebaRandom {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int index = rnd.nextInt(4); //imprime numeros enteros entre el cero y el tres.
		System.out.println(index);
	}
}
