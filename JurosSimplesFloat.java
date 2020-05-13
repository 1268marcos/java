package aovivo13maio2020jurossimples;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		float p, r, t, juroscalculado;
		
		System.out.println("Digite o valor principal");
		
		p = tcd.nextFloat();
		
		System.out.println("Digite a taxa de juros");
		
		r = tcd.nextFloat();
		
		System.out.println("Digite o período");
		
		t = tcd.nextFloat();
		
		juroscalculado = (p * r * t)/100;
		
		System.out.println("Valor juros calculado " + juroscalculado);
		
		System.out.println("Valor acrescido do juros " + (p+juroscalculado) );
		
	}
	
}
