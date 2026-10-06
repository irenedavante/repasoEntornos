package paquete4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*5.Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra 
		 * por pantalla la longitud y el área de la circunferencia. 
		 * Longitud de la circunferencia = 2PIRadio, Área de la circunferencia = PI*Radio2*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("introduce el radio");
		double radio = input.nextDouble();
		
		double longitud = 2* Math.PI* radio;
		double area = Math.PI*radio *radio;
		
		System.out.println("la longitud es : "+ longitud);
		System.out.println("el area es "+ area);
		
		input.close();
		
	}

}
