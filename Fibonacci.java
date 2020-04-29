package aovivo29abril2020fibonacci;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		try {
			int quant, num1 = 0, num2 = 1;
			System.out.println("Quantos numeros na sequencia Fibonacci?");
			quant = tcd.nextInt();
			System.out.println("A série de Fibonacci tem " + quant + " números");
			int i = 1;
			while(i <= quant) {
				System.out.print(num1 + " ");
				int somaAnteriorProximo = num1 + num2;
				num1 = num2;
				num2 = somaAnteriorProximo;
				i++;
				//i = i + 1;
			} 			
		} catch(Exception e) {
			System.out.println("Falha " + e.getMessage());
		}
	}
}

//https://www.gestaoeducacional.com.br/sequencia-de-fibonacci/
