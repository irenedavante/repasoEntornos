package paquete2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		//Pide un número y muestra el doble.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		
		int num = input.nextInt();
		
		//forma corta
		System.out.println("el doble de " + num + " es : " + (num*2));
		
		//forma larga
		int doble = num *2;
		
		System.out.println("el doble de " + num + " es: " +doble );
		
		input.close();
	}

}
