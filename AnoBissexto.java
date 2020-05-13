package aovivo13maio2020anobissexto;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		int ano = 0;
		
		try {
			
			while( ano < 1800  ) {
				System.out.println("Digite um ano maior ou igual a 1800");
				ano = tcd.nextInt();
			} 
			
			if( ano % 4 == 0 ) {
				
				if( ano % 100 == 0 ) {
					
					if( ano % 400 == 0) {
						System.out.println("Ano bissexto");
					} else {
						System.out.println("Ano não é bissexto");
					}
					
				} else {
					System.out.println("Ano bissexto");
				} 
				
				
			} else {
				System.out.println("Ano não é bissexto");
			}
				
			
			
		} catch(Exception e) {
			System.out.println("Falha :" + e.getMessage());
		}
		
	}
	
}
