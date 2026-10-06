package paquete4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		/*6.Programa que pida la fecha de nacimiento. El programa pedirá primero el número,
		 *  luego el mes escrito (Enero, Febrero, etc.) y finalmente el año en número. 
		 *  Debe mostrar la fecha completa en una sola línea con formato: dia/mes/año. 
		 *  Al leer el mes quizás tengamos un problema -> Revisar apuntes sobre vaciar
		 *   el buffer de lectura, en la clase Scanner.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("introduce el dia ");
		int dia = input.nextInt();
		
		input.nextLine();
		
		System.out.println("introduce el mes");
		String mes = input.nextLine();
		
		System.out.println("introduce el año");
		int anno= input.nextInt();

		System.out.println(dia + "/"+ mes+ "/"+ anno);
		
		input.close();
	}

}
