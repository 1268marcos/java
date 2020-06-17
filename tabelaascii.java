package aovivo17junho2020ascii;

import java.util.Scanner;

public class Tabela {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		String nome = tcd.nextLine();
		
		char c[] = nome.toCharArray();
		int  a[] = new int[c.length];
		
		for( int i=0 ; i <= c.length-1 ; i++) {
			a[i] = c[i];
			System.out.println("O valor Ascii de " + c[i] + " é " + a[i] );
		}
		
	}
	
}
