package pruebas;

import java.util.Set;
import java.util.HashSet;

public class TestGeneric {
	
	public static void main(String[] args) {
		
//      Set<Cuenta> gen = new Set<Cuenta>();  marca error. NO es posible instanciar una interfaz		
		Set<Cuenta> gen = new HashSet <Cuenta>();
	}

}
