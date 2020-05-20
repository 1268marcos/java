package aovivo20maio2020triangulo;

import java.util.Scanner;

public class CalculaArea {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Digite o altura do triângulo");
		double altura = tcd.nextDouble();
		
		System.out.println("Digite a base do triângulo");
		double base = tcd.nextDouble();
		
		double area = altura*base / 2;
		System.out.println("Valor da área " + area);
		
	}
	
}
