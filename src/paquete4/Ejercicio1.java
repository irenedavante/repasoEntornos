package paquete4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		/*1.Programa Java que declare una variable “num” de tipo int y asígnale un valor. 
		 * A continuación escribe las instrucciones que realicen lo siguiente: Incrementar num en 77,
		 *  decrementarla en 3, Duplicar su valor. Después de cada operación el valor de la variable 
		 *  se debe haber modificado*/

	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce un numero");
		int num = sc.nextInt();
	
		num= num +77;
		System.out.println("tras sumar 77: " +num);
		
		num = num-3;
		System.out.println("tras restar 3: " + num);
		
		num = num*2;
		
		System.out.println("el doble es : "+  num);
		
		
		sc.close();

		
	}

}
