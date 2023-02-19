package pruebas;

import javax.swing.JOptionPane;

public class Contraseña {
	
	public static void solicitarContraseña() {

		String clave = "azul";
		String password = " ";

		while (clave.equals(password) == false) {
			password = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			if (clave.equalsIgnoreCase(password) == false) System.out.println("contraseña incorrecta");
		}
		System.out.println("Eureka, contraseña correcta");
	}
}

/* 
* Hacer un commit hasta este punto.
* POR HACER: Crear un ciclo do - while donde la clave se pida a lo sumo cinco veces 
*/


