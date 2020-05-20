package aovivo20maio2020quadrado;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class CalculaArea {

	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		try {
			System.out.println("Digite o valor do lado");
			double lado = tcd.nextDouble();
			double area = lado * lado;
			//double area = Math.pow(lado , 2);
			NumberFormat nf = new DecimalFormat("#,##0.00");
			
			System.out.println("Área do quadrado " + nf.format(area) );
			
			
		} catch (Exception e) { 
			System.out.println("Falha : " + e.getMessage());
		} 
		
	}
	
}
