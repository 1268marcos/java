package aovivo03junho2020isosceles;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.Scanner;

public class AreaTrianguloIsosceles {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			System.out.println("Digite a medida do mesmo lado");
			double lado = tcd.nextDouble();
			System.out.println("Digite a medida da base");
			double base = tcd.nextDouble();
			
			//algoritmo I
			double area = (base/4) * Math.sqrt( (4*lado*lado) - (base*base) );
			System.out.println("A área do triangulo isosceles é " + area);
			
			//algoritmo II
			double altura = Math.sqrt( lado*lado - (base/2)*(base/2) );
			double area2 = (base*altura)/2;
			System.out.println("L`aire du triangle isocèle est: " + area2);
			
			//Exibindo formatado
			NumberFormat nf = new DecimalFormat("#,##0.00");
			System.out.println("Areanet för likkorniga triangeln är " + nf.format(area2));
			
		} catch(Exception e ) {
			System.out.println("Falha :" + e.getMessage());
		}
		
	}
	
}
