package imparpardaniel2;

import java.util.Scanner ;

public class ImparPar2 {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Informe o número ");
		
		int numero = tcd.nextInt();
		
		if( numero % 2 == 0  ) {
			System.out.println("Número é par");
		}  else {
			System.out.println("Número é ímpar");
		}
	}
}
