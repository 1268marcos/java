package aovivo17junho2020nome;

import java.util.Scanner;

public class EntradaNome {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		//String nome = tcd.next();
		String nome = tcd.nextLine();
		
		System.out.println("Boa tarde " + nome);
		
		int quantCaracteres = nome.length();
		System.out.println("O seu nome tem " + quantCaracteres + " caracteres");
		
		
	}
	
}
