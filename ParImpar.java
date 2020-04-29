package aovivo29abril2020;
import java.util.Scanner;

public class ParImpar {

     public static void main(String[] args) {
		Scanner tcd  = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite o número para descobrir par ou ímpar");
			int numero;
			numero = tcd.nextInt();
			
			if( numero % 2 == 0 ) {
				System.out.println("PAR");
			} else {
				System.out.println("ÍMPAR");
			}
			
		} catch(Exception e) {
			System.out.println("Falha: " + e.getMessage());
		}
		
	}
	
}
