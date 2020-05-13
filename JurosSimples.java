package aovivo13maio2020jurossimples;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		double p, r, t, juroscalculado;
		
		System.out.println("Digite o valor principal");
		
		p = tcd.nextDouble();
		
		System.out.println("Digite a taxa de juros");
		
		r = tcd.nextDouble();
		
		System.out.println("Digite o período");
		
		t = tcd.nextDouble();
		
		juroscalculado = (p * r * t)/100;
		
		System.out.println("Valor juros calculado " + juroscalculado);
		
		System.out.println("Valor acrescido do juros " + (p+juroscalculado) );
		
	}
	
}
