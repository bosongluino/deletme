package pruebas;

import java.util.LinkedList;

public class RecorriendoListaEnlazada {

	static Alimento pera = new Alimento("dulce");
	static Alimento limon = new Alimento("agrio");
	static Alimento naranja = new Alimento("amarga");
	static Alimento guayaba = new Alimento("dulce");
	
	static LinkedList<Alimento> frutas = new LinkedList<Alimento>();

	public static void main(String[] args) {
		
		LinkedList lista = new LinkedList();
		lista.add("gato");
		lista.add(50);
		lista.add(true);

		frutas.add(pera);
		frutas.add(limon);
		frutas.add(naranja);
		frutas.add(guayaba);
		
		boolean bool = tieneSabor("agrio");
		System.out.println(bool);
		
		Alimento food;
		food = frutas.get(1);
		System.out.println(food);
		System.out.println(frutas.get(0));
	}
	
	public static boolean tieneSabor(String sabor) {
		for (Alimento alimento : frutas) {
			if(alimento.getSabor() == sabor) 
				return true;
			else 
				return false;
		}
		return false;
	}
}	

class Alimento {

	private String sabor;

	public Alimento(String sabor) {
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}
	@Override
	public String toString() {
		return sabor;
	}

}