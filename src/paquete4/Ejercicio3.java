package paquete4;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*Programa que declare una variable variableA de tipo entero y asígnale un valor. A
continuación, muestra 3 mensajes: uno indicando si el valor de A es múltiplo de 5 o no
 otro indicando si es múltiplo de 10 o no
 y después otro indicando si es mayor, menor, o igual a 100 (3 posibilidades, 1 solo
mensaje). Consideraremos el 0 como positivo. Si no, que me muestre otro mensaje (p.e.
“No se cumplen las condiciones”)*/
		
		int variableA =1003;
		
		//multiplo de 5
		if(variableA % 5 == 0) {
			System.out.println("es multiplo de 5");
		} else {
			System.out.println("no es multiplo de 5");
		}
		
		//multiplo de 10 
		if (variableA %10 == 0) {
			System.out.println("es multiplo de 10 ");
		}else {
			System.out.println("no es multiplo de 10");
		}
		
		//mayor o menor o igual a 100
		if(variableA >100) {
			System.out.println(variableA + " es mayor que 100");
		}else if (variableA <100 ) {
			System.out.println(variableA + " es menor que 100");
		}else {
			System.out.println("el numero es igual 100");
		}
		
	}

}
