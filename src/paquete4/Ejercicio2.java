package paquete4;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * Programa que declare, al menos, cuatro variables de tipo int 
		 * variableA, variableB, variableC y variableD, asígnale un valor a cada una y
		 *  muestra su valor por consola. A continuación, realiza las asignaciones necesarias 
		 *  para que: A tome el valor de B, B tome el valor de C, C tome el valor de D,
		 *   D tome el valor de A. Muestra de nuevo su valor para comprobarlo.*/

		int variableA = 3;
		int variableB = 100;
		int variableC = 972;
		int variableD =0;
		int temp = variableA;
		
		System.out.println(variableA);
		System.out.println(variableB);
		System.out.println(variableC);
		System.out.println(variableD);
		System.out.println("----------------------------------------------------------------");
		
		variableA = variableB;
		variableB = variableC;
		variableC = variableD;
		variableD = temp;
		
		System.out.println(variableA);
		System.out.println(variableB);
		System.out.println(variableC);
		System.out.println(variableD);
	}

}
