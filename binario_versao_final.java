package aovivo06maio2020binario;

import java.util.Scanner;
import java.util.Stack;  //pilha 

public class CalculadoraConversao {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			
			int numDecimal = -1;
			while( numDecimal < 0 ) {
				System.out.println("Qual número decimal maior ou igual a zero para converter?");
				numDecimal = tcd.nextInt();
			} 
			
			String resp = getNumeroBinario(numDecimal);
			System.out.println( numDecimal + " em binário é " + resp);
			
		} catch(Exception e) {
			System.out.println("Falha :" + e.getMessage());
		}
	}
	
	public static String getNumeroBinario(int valorDecimal) {
		Stack pilha = new Stack();	
		int resto = 0;
		int valor = valorDecimal;		
		while( valor > 0 ) {
			resto = valor % 2;
			pilha.push(resto);
			valor = valor / 2;
		}		
		String bin = "";		
		while( !pilha.isEmpty() ) {
			bin = bin + pilha.pop().toString();
		}		
		
		if( valorDecimal == 0 ) {
			bin = "0";
		}
		
		return bin;		
	}
	
}
