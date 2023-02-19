package pruebas;

import java.util.LinkedList;

public class RecorriendoListaEnlazada {

	static Alimento pera = new Alimento("dulce");
	static Alimento limon = new Alimento("agrio");
	static Alimento naranja = new Alimento("amarga");
	static Alimento guayaba = new Alimento("dulce");
	
	static LinkedList<Alimento> alimentos = new LinkedList<Alimento>();

	public static void main(String[] args) {

		alimentos.add(pera);
		alimentos.add(limon);
		alimentos.add(naranja);
		alimentos.add(guayaba);
		
		boolean bool = tieneSabor("amarga");
		System.out.println(bool);
	}
	
	public static boolean tieneSabor(String sabor) {
		for (Alimento alimento : alimentos) {
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
		return "{sabor: " + sabor + " }";
	}

}