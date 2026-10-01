package paquete2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//Pide la ciudad del usuario y muestra "Vives en [ciudad]".
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("introduce la ciudad");
		
		String ciudad = input.nextLine();
		
		System.out.println("vives en " + ciudad );
		
		input.close();
	}

}
