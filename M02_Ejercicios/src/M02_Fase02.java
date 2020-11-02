//Importamos las ArrayList del paquete Java Util.

import java.util.ArrayList;

//Creamos la clase y el main.

public class M02_Fase02 {
	public static void main(String[] args) {
		
		//Declaramos e inicializamos la lista "name". Incluye un número al final para evaluar lo que solicita el enunciado del ejercicio.
		
		ArrayList<String> name  = new ArrayList<>();
		name.add("L");
		name.add("A");
		name.add("R");
		name.add("A");
		name.add("4");
	
		//Declaramos la variable booleana para determinar si cada carácter es una vocal, consonante o número.
		
		boolean vocal = false;
		
		//Lanzamos el bucle FOR que recorrerá la matriz y printará por pantalla cada carácter, más un mensaje extra en función de si es vocal, consonante o número.

		for (Object o:name) {
			
			//Construimos el IF donde marcamos la condición que marcará como "vocal" al carácter evaluado.			

			if(o == "A" || o == "E" || o == "I" || o == "O" || o == "U") {
				vocal = true;
				System.out.println(o + " (VOCAL)");
			}
			
			//Construimos un segundo IF donde marcamos la condición que marcará como "número" al carácter evaluado.
			
			if(o == "1" || o == "2" || o == "3" || o == "4" || o == "5" || o == "6" || o == "7" || o == "8" || o == "9" || o == "0") {
				System.out.println(o + " ¡Los nombres propios no contienen números!");
			}
			
			//Mediante un ELSE, marcamos al carácter evaluado como "consonante" cuando no sea ni "vocal" ni "número"			
			else {	
				System.out.println(o + " (CONSONANTE)");
			}
			
		}
		
	}
}