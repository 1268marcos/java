package adivinhar;

import java.util.Scanner;
import java.util.Random;

public class Descobrindo {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		Random rnd = new Random();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(rnd.nextInt(6)+1);
		}
		
		try {
			System.out.println(1/0);
		} catch(Exception e) {
			System.err.printf("\nFalha: %s", e.getMessage());
		} 
				
	}
	
}
