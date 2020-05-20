package aovivo20maio2020adivinhanumero;
import java.util.Scanner;

public class Adivinha {
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		int numeroSecreto;
		int numeroDigitado;
		int quantidadeTentativas = 0;
		boolean sinalizadora = false;
		
		numeroSecreto = (int)    (Math.random()*100);
		
		while( !sinalizadora ) {
			quantidadeTentativas++;
			System.out.println("Digite seu palpite (entre 0 e 99)");
			numeroDigitado = tcd.nextInt();
			 
			if(numeroDigitado == numeroSecreto) {
				System.out.println("Parabéns");
				sinalizadora= true;
			} else if (numeroDigitado < numeroSecreto) {
				System.out.println("Tente mais alto");
			} else {
				System.out.println("Tente mais baixo");
			}
		}
		System.out.println("Você acertou após " + quantidadeTentativas + " vezes");
	}
}
