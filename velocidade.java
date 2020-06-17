package aovivo17junho2020kmhmilhash;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Converter {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Informe a velocidade em km/h");
		
		try {
			
			double velocKmH = tcd.nextDouble();
			double velocMiH = velocKmH / 1.609;
			
			NumberFormat nf = new DecimalFormat("#,##0");
			
			System.out.println("Velocidade em Milhas/h " + nf.format(velocMiH) );
			
		} catch (Exception e) {
			System.out.println("Falha :" + e.getMessage() );
		}
		
	}
	
}
