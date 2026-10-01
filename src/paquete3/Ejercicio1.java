package paquete3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// añadir el resto de operaciones aritméticas 
		//hacer la tabla de multiplicar de un numero introducido por pantalla 
	
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("introuduce un numero");
		int num1= input.nextInt();
		
		System.out.println("Introcude un segundo numero");
		int num2= input.nextInt();
		
		/*
		System.out.println("intoduce dos numeros");
		int num1 = input.nextInt();
		int num2 = input.nextInt();*/
		
		//SUMA
		int suma= num1 + num2;
		System.out.println("la suma es : " + suma );
		
		//RESTA
		//int resta = num1 - num2;
		//System.out.println("la resta es : "+ resta);	
		System.out.println("la resta es : " + (num1- num2));
		
		//Multiplicacion
		System.out.println(" La multiplicacion es : " +(num1*num2));	
		
		
		//division
		
		if(num2 != 0) {
			
			System.out.println("la division es : "+ (num1/num2)); 
			
		}else {
			System.out.println("no se puede dividir entre 0 ");
		}
		
		//System.out.println("la division es: "+ (num1/num2));
		
		
		
		
	 /*
	  * num1 = 0 y num2 = 5 --> resultado da 0 
	  * num1 = 5 y num2 = 0 --> no se puede dividir entre 0  
	  * 						si no esta el if Else sale mensaje de error
	  * num1 = 0 y num2 = 0 --> no se puede dividir entre 0  
	  * 						si no esta el if Else sale mensaje de error
	  * */
		
		
		input.close();
	}

}
