//Importamos las ArrayList del paquete Java Util.

import java.util.ArrayList;

//Creamos la clase y el main.

public class M02_Fase02 {
	public static void main(String[] args) {
		
		//Declaramos e inicializamos la lista "name". Incluye un n�mero al final para evaluar lo que solicita el enunciado del ejercicio.
		
		ArrayList<String> name  = new ArrayList<>();
		name.add("L");
		name.add("A");
		name.add("R");
		name.add("A");
		name.add("4");
	
		//Declaramos la variable booleana para determinar si cada car�cter es una vocal, consonante o n�mero.
		
		boolean vocal = false;
		
		//Lanzamos el bucle FOR que recorrer� la matriz y printar� por pantalla cada car�cter, m�s un mensaje extra en funci�n de si es vocal, consonante o n�mero.

		for (Object o:name) {
			
			//Construimos el IF donde marcamos la condici�n que marcar� como "vocal" al car�cter evaluado.			

			if(o == "A" || o == "E" || o == "I" || o == "O" || o == "U") {
				vocal = true;
				System.out.println(o + " (VOCAL)");
			}
			
			//Construimos un segundo IF donde marcamos la condici�n que marcar� como "n�mero" al car�cter evaluado.
			
			if(o == "1" || o == "2" || o == "3" || o == "4" || o == "5" || o == "6" || o == "7" || o == "8" || o == "9" || o == "0") {
				System.out.println(o + " �Los nombres propios no contienen n�meros!");
			}
			
			//Mediante un ELSE, marcamos al car�cter evaluado como "consonante" cuando no sea ni "vocal" ni "n�mero"			
			else {	
				System.out.println(o + " (CONSONANTE)");
			}
			
		}
		
	}
}