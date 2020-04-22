package aovivo22abril2020;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			System.out.println("Digite a temperatura em graus Celsius");
						
			double cel = -273.15;
			
			//   ==    representa igualdade
			//   =     representa atribuir um valor
			
			while( cel <= -273.15 ) {
				System.out.println("Lembre-se a temperatura inicial é -273.15");
				cel = tcd.nextDouble();
				//  break;
			}
			
			//Fórmula	(15 °C × 9/5) + 32 = 59 °F

			double fah = (cel * 9/5) + 32;
			
			System.out.println( cel + "ºC é igual a " + fah + "ºF");
			
		} catch(Exception e) {
			System.out.println( "Falha: " + e.getMessage() );
		}
		
	}
	
}
