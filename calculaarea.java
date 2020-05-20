package aovivo20maio2020circulo;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class CalculaArea {

	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		System.out.println("Digite o raio do círculo");
		double raio = tcd.nextDouble();
		
		double area = Math.PI * raio * raio;
		//double are1 = Math.PI * Math.pow(raio, 2);
		
		double comprimento = 2 * Math.PI * raio;
		//double compriment1 = Math.PI * 2 * raio;
		//double compriment2 = raio * Math.PI * 2; 
		
		NumberFormat nf = new DecimalFormat("#,##0.00");
		
		System.out.println("Valor calculado da área "  + nf.format(area)  );
		
		System.out.println("Valor do comprimento " + nf.format(comprimento));
	
	}
	
}
