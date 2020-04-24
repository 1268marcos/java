package myimccalculator;

import java.util.Scanner;


public class Calculadora {

	public static void main(String args[]) {
		
		Scanner tcd = new Scanner(System.in);
		double peso = 0;
		double altura = 0;
		double valor = 0;
		
		System.out.println("Digite peso em kg");
		peso = tcd.nextDouble();
		
		System.out.println("Digite altura em cm");
		altura = tcd.nextDouble();
		
		valor = peso / ((altura/100) * (altura/100));
		
		System.out.println("Seu IMC é ");
		System.out.print(valor);
		
	}
	
}
