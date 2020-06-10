package aovivod10junho2020alcance;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculaDistancia {

	public static void main(String[] args) {
		
		double g, anguloRadianos, d;
		double anguloLancamentoGraus;
		double veloc;   //    m/s
		g = 9.8;//    
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Digite o angulo de lancamento");
		anguloLancamentoGraus = tcd.nextDouble();
		
		System.out.println("Digite a velocidade de lancamento");
		veloc = tcd.nextDouble();
		
		anguloRadianos = anguloLancamentoGraus * Math.PI / 180;
		
		d = 2 * veloc * veloc * 
				Math.sin(anguloRadianos) *
				Math.cos(anguloRadianos) / g ;
		
		NumberFormat nf = new DecimalFormat("#,##0.00");
				
		System.out.println("Distância " + nf.format( d ) + " metros" );
			
	}	
	
}
