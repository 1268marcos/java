package aovivo06maio2020binario;

import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Digite o valor para calcular a tabuada");
		
		int n = tcd.nextInt();
		
		for( int i = 5; i <= 10; i++ ) {
			
			System.out.println( n + "x" + i + "=" + (n*i) );
			
		}		
	}
}
