package cnh;

import java.util.Scanner;

public class PrimeiraCNH {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		int idade = tcd.nextInt();
		
		int pontos = 0;
		
		if( idade >= 18) {
			pontos++;
		}
		
		System.out.println("Você sabe ler e escrever?");
		String sabeLer = tcd.next();
		
		if( sabeLer.equals("s") || sabeLer.equals("S") ) {
			pontos++;
		}
		
		System.out.println("Você tem RG?");
		String temRg = tcd.next();
		
		if( temRg.equals("s") || temRg.equals("S")) {
			pontos++;
		}
		
		System.out.println("Você tem CPF?");
		String temCpf = tcd.next();
		
		if( temCpf.equals("s") || temCpf.equals("S") ) {
			pontos++;
		}
		
		if( pontos == 4 ) {
			System.out.println("Você pode ter a sua CNH");
		} else {
			System.out.println("Você não atende aos requisitos");
		}
				
	}
	
}

