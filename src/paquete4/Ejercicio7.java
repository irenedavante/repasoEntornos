package paquete4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*7.Programa que lee una cadena compuesta de varias palabras por teclado y 
		 * la muestra quitándole los espacios. Emplear métodos de String (reemplazar caracteres).*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("introduce una frase");
		String frase = input.nextLine(); //hola que tal 
		
		frase = frase.replace("_", "-");
		
		System.out.println(frase);
		
		input.close();
		
	}

}
