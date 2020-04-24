package aovivo08abril;

import java.util.ArrayList;
import java.util.Collections;

public class EstudoLista {

	public static void main(String[] args) {
		
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mercedes");
		carros.add("VW");
		carros.add("Ferrari");
		carros.add("Caoa Cherry");
		
		Collections.sort(carros);
		
		/*
		 * for (int i = 0; i < carros.size(); i++) {
			//System.out.println( carros.get(i) );
			System.out.println( carros.get(i).toString().toUpperCase() );
		}
		*/
		
		for (String string : carros) {
			System.out.println( string );
		}
		
		//  comentário de linha
		
		/*
		 * comentário de bloco de código
		 * 
		 */
				
	}	
}
