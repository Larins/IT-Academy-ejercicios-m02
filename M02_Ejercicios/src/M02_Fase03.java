//Importamos el paquete Java Util, que contiene HashMap.

import java.util.*;

//Crear la clase y el método main.

public class M02_Fase03 {
	public static void main(String[] args) {
	
        //Declaramos el mapa con HASHMAP.
		
		HashMap <String, Object> mapa = new HashMap <String, Object> ();

		//Usamos método PUT para poblar el mapa.
		
		mapa.put("L","1");
		mapa.put("A","2");
		mapa.put("R","1");
		
		System.out.println(mapa);
	}

}
