//Importamos las ArrayList del paquete Java Util.

import java.util.ArrayList;

//Creamos la clase y el main.

public class M02_Fase04 {
	public static void main(String[] args) {
		
		//Declaramos e inicializamos la lista "name".
		
		ArrayList<String> name  = new ArrayList<>();
		name.add("L");
		name.add("A");
		name.add("R");
		name.add("A");
		
		//Declaramos e inicializamos la lista "surname".
		
		ArrayList<String> surname  = new ArrayList<>();
		surname.add("S");
		surname.add("A");
		surname.add("I");
		surname.add("Z");
		
		//Fusionamos las dos listas.
		
		ArrayList<String> fullname = new ArrayList<>();
		fullname.addAll(name);
		fullname.add(" ");
		fullname.addAll(surname);
		System.out.println(fullname);
	}
}