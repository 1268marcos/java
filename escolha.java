package aovivo17junho2020escolha;

import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		System.out.println("Digite o número");
		int numero = tcd.nextInt();
		
		switch( numero ) {
		
		case 0:
			System.out.println("Zero"); break;
		case 1:
			System.out.println("Um"); break;
		case 2: 
			System.out.println("Dois"); break;
		default: 
			System.out.println("Número não está na lista"); break;
		
		}
		
	}
	
}
