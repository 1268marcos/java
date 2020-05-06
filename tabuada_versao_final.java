package aovivo06maio2020tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {   
			
			int n = -1;
			while( n < 0 ) {
				System.out.println("Digite o número para calcular a tabuada");
				n = tcd.nextInt();
			}
			
			for( int i = 0; i <= 10; i++ ) {
				System.out.println( n + "x" + i + "=" + (n*i) );
			}
						
		} catch(Exception e) {
			System.out.println("Falha : " + e.getMessage());
			System.out.println("Causa : " + e.getCause() );
			
		}		
		
	}
	
}
