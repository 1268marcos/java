package aovivo22abril2020;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius");
		
		float cel;
		
		cel = tcd.nextFloat();
		
		float fah;
		
		//(15 °C × 9/5) + 32 = 59 °F

		fah = (cel * 9/5) + 32;
		
		System.out.println("A temperatura em Fahrenheit " + fah);
		
	}
	
}
