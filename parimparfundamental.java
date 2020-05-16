package parimpardaniel;

import java.util.Scanner;


public class ImparPar {

	public static void main(String[] args) {
		
		Scanner tcd  = new Scanner (System.in);
		System.out.println("Digite o número ");
		
		String numero = tcd.next();
		
		int quantDigitos = numero.length();
		
		String ultimoDigito = numero.substring(quantDigitos-1);
		
		String tipo ;
		
		switch(ultimoDigito) {
		
		case "1" : tipo = "ímpar"; break;
		case "3" : tipo = "ímpar"; break;
		case "5" : tipo = "ímpar"; break;
		case "7" : tipo = "ímpar"; break;
		case "9" : tipo = "ímpar"; break;
		
		default: tipo = "par"; break;
		
		}
		
		System.out.println("O número é " + tipo);
		
	}
	
}
