package paquete4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*9.Programa que lee una cadena de texto y posteriormente lee un carácter, 
		 * y me dice si la cadena comienza por ese carácter.*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce una frase");
		String frase= sc.nextLine();
		
		System.out.println("escribe un caracter");
		char caracter = sc.next().charAt(0);
		
		if(frase.charAt(0)==caracter) {
			System.out.println("empiezan las dos por la mima letra");
		}else {
			System.out.println("no empiezan por la misma letra");
		}
		
		sc.close();

	}

}
