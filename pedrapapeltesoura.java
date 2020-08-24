package pedrapapeltesoura;

import java.util.Scanner;
import java.util.Random;

public class Jogo {

	public static void exibirEscolha(int palpite) {
		switch(palpite) {
		case 1: System.out.println("pedra");break;
		case 2: System.out.println("tesoura");break;
		case 3: System.out.println("papel");break;
		default: System.out.println("ops!"); break;
		}
	}
	
	public static void compare(int palpiteJogador, int palpitePC) {
		if(palpiteJogador==palpitePC) {
			System.out.println("EMPATE");
		} else if(palpiteJogador==1) {
			if(palpitePC==2) {
				System.out.println("Pedra win");
			} else {
				System.out.println("Papel win");
			}
		} else if(palpiteJogador==2) {
			if(palpitePC==1) {
				System.out.println("Pedra win");
			} else {
				System.out.println("Tesoura win");
			}
		} else if(palpiteJogador==3) {
			if(palpitePC==1) {
				System.out.println("Papel win");
			} else {
				System.out.println("Tesoura wind");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		System.out.println("Jogador digite 1-pedra 2-tesoura 3-papel");
		int palpiteJogador = tcd.nextInt();
		exibirEscolha(palpiteJogador);
		
		Random rnd = new Random();
		System.out.println("PC escolheu");
		int palpitePC = rnd.nextInt(3) + 1;
		exibirEscolha(palpitePC);

		compare(palpiteJogador, palpitePC);
		
	}
	
}
