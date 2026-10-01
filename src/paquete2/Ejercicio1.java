package paquete2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		//Pide el nombre al usuario y muestra "Hola, [nombre]".
		
		Scanner input = new Scanner (System.in); 
	
		System.out.println("como te llamas?");
		
		//String nombre = "IRENE";
		
		String nombre= input.nextLine();
		
		System.out.println("hola "+ nombre);
		
		System.out.println("introduce otro nombre ");
		nombre= input.nextLine();
		
		System.out.println("hola "+nombre );
		
		input.close();
	
	}

}
