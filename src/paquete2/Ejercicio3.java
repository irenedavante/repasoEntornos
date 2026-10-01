package paquete2;

import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//Pide un número y muestra el triple.
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("introduce un numero");
		
		int num= input.nextInt();
		
		System.out.println("El triple de "+ num + " es "+ (num*3));
		
		input.close();
		
	}

}
