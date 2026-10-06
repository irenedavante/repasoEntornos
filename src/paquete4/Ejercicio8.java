package paquete4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*8.Programa que lea un número entero de 5 cifras y muestre sus cifras desde el 
		 * principio como en el ejemplo. Utiliza la división de enteros y posteriormente realiza lo
		 *  mismo pero tratándolo como un String, y aplicando métodos de String.*/

		Scanner input = new Scanner(System.in);
		System.out.println("introduce un numero de 5 cifras");
		int num = input.nextInt();
		
		//forma 1: division entera
		System.out.println(num/10000);
		System.out.println(num/1000);
		System.out.println(num/100);
		System.out.println(num/10);
		System.out.println(num);
		
		input.nextLine();
		
		//forma 2: como String
		//String cadena = ""+num;
		System.out.println("introduce una cadena nueva");
		String cadena = input.nextLine();
		System.out.println(cadena.substring(0, 5));
		System.out.println(cadena.substring(0, 4));
		System.out.println(cadena.substring(0, 3));
		System.out.println(cadena.substring(0, 2));
		System.out.println(cadena.substring(0, 1));
		
		
		
		input.close();
	}

}
