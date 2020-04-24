package aovivo08abril2020;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploListaTry {
	
	public static void main(String[] args) {
		
		int soma =0;
		
		//dica para quem nao tem o ECLIPSE    https://repl.it/
		try {
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			numeros.add(33);
			numeros.add(3);
			numeros.add(51);
			numeros.add(12);
			numeros.add(1);
			numeros.add(0);
			numeros.add(303);
			Collections.sort(numeros);
			for (int i = 0; i < numeros.size(); i++) {
				System.out.println(  numeros.get(i) );
				soma = soma + numeros.get(i);
			}
			System.out.println("A soma de valores é " + soma);
			
		} catch (Exception e) {
			System.out.println("Falha \n" + e.getMessage() );
		}
		
	}
}
