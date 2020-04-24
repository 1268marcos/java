package aula1abril;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import java.util.Random;

public class Estudo {
public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		Random rnd = new Random();
		
		System.out.println("Se assistiu o Canal do Professor vai lembrar disso... \n");
		
		for (int i = 0; i < 5; i++) {
			//System.out.println( rnd.nextInt() );
			//System.out.println( rnd.nextDouble() );
			//System.out.println( rnd.nextDouble() * 10 );
			//System.out.println( rnd.nextDouble() * 100 );
			System.out.println( (i+1) + "ª volta do Professor Marcos");
		}
		
		System.out.println("****** JOGO DE DADOS ****** \n");
		
		try {
			
			int acertos = 0 ;
			int quantJogos= 0;
			
			boolean res = true;
			
			//while   representa ENQUANTO...
			
			while (res) {
				
				System.out.println("Qual a face você escolhe (1-6) ?");
				
				int numero = 0;
				
				//numero = tcd.nextInt();
				while (numero > 6 || numero == 0) {
					System.out.println("Digite 1 ou 2 ou 3 ou 4 ou 5 ou 6 (o dado tem 6 faces)");
					numero = tcd.nextInt();
				}
				
				//  || operador lógico OU      
				//  && operador lógico E 
				
				System.out.println( "JOGANDO O DADO....");
				
				quantJogos++;  // ++ indica que estou somando 1 unidade
				
				int dado = rnd.nextInt(6)+1;
				
				if( numero == dado) {
					System.out.println( "You Win" );
					acertos++;
				} else {
					System.out.println( "Você perdeu. Mostrando o dado " + dado );
				}
				
				String qualResposta;
				System.out.println("Você quer continuar jogando (S ou N)?");
				qualResposta = tcd.next();
				
				//Se você assistiu todo o vídeo vai lembrar do que acontece(u) aqui
				//if(qualResposta == "n" || qualResposta == "N") {
			    //	res = false;
			    //}
				
				if( qualResposta.equals("n") || qualResposta.equals("N") ) {
					res = false;
				}
				
				// =   isso é recebe (atribuindo um valor)
				
				//==   isso é igual
				//     é utilizado para comparar o valor que uma variável guarda 
				//     é mais útil para variáveis de tipo primitivos 
				//     (boolean, byte, short, char, int, long, float e double). 
				
				//  equals (equivalência)   Para variáveis do tipo referência (String), 
				//  verifica se duas variáveis (ou uma variável e um valor)
				//  apontam para o mesmo objeto (tipo).
				
			}
			
			System.out.println("*** FIM DE JOGO *** \n");
			System.out.println("A quantidade total de jogos foi " + quantJogos + "\n");
			System.out.println("Você acertou " + acertos + " \n");
			
		    int taxa = (acertos*100/quantJogos*100) / 100 ;
		    
			System.out.println("A taxa de sucesso é " + taxa + "%");
			
		} catch (Exception e) {
			System.err.printf("\n Falha: %s" , e.getMessage());
			//System.out.println("Digitacao incorreta");
		}
		
	}
	 
	
}
