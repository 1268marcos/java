package aovivo13maio2020mdc;

import java.util.Scanner;

public class Mdc {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			
			int num1=0;
			System.out.println("Informe o primeiro número");
			num1 = tcd.nextInt();
			
			int num2=0;
			System.out.println("Informe o segundo número");
			num2 = tcd.nextInt();
			
			int menor, maior;
			
			if( num1 > num2 ) {
				maior = num1;
				menor = num2;
			}  else {
				maior = num2;
				menor = num1;
			}
			
			//System.out.println("Maior" + maior);
			
			int aux = 0;
			
			while( (maior % menor) != 0   ) {
				aux = menor;
				menor = (maior % menor);
				maior = aux;
			}
			
			System.out.println("MDC ( " + num1 + " , " + num2 + " ) = " + menor);
			
			
		} catch(Exception e ) {
			System.out.println("Falha " + e.getMessage());
		}
		
		
	}
	
}
