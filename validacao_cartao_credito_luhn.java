package validarcartaocredito;

import java.util.Scanner;

public class Luhn {
	
	public static int somaDigitos(int numero) {
		if( numero < 9 ) {
			return numero;
		} else {
			return numero%10 + 1;
		}
	}
		
	public static boolean checkValidade(String numeroCartao) { 
		
		int somaPar=0;
		int somaImpar=0;
		int aux=0;
		
		//PARES
		for( int j=numeroCartao.length()-2; j>=0; j=j-2) {
			aux = Integer.parseInt(numeroCartao.charAt(j) + "");
			System.out.println("digito:" + aux + " dobro:" + (aux*2) + " somadigitos:" + somaDigitos(aux*2));
			somaPar = somaPar + somaDigitos(aux*2);
		}
		System.out.println("Soma par: " + somaPar);
		
		//IMPARES
		for( int i=numeroCartao.length()-1; i>=0; i=i-2) {
			aux = Integer.parseInt(numeroCartao.charAt(i) + "");
			System.out.println("digito:" + aux + " somadigitos:" + aux);
			somaImpar = somaImpar + aux;			
		}
		System.out.println("Soma ímpar: " + somaImpar);
		
		System.out.println("Soma total pares e ímpares " +  (somaPar+somaImpar) );
		
		if( (somaPar+somaImpar)%10 == 0 ) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static String checkBandeiraCartao (String numero1IdEmissor, 
			String numero2IdEmissor) {
		if (numero2IdEmissor.equals("37")) {
			return "AMERICAN EXPRESS";
		} else if (numero2IdEmissor.equals("35")) {
			return "JCB";
		} else if (numero1IdEmissor.equals("4")) {
			return "VISA";
		} else if (numero1IdEmissor.equals("5")) {
			return "MASTER";
		} else if (numero1IdEmissor.equals("6")) {
			return "DISCOVER";
		} else {
			return "PROF.MARCOS";
		}
	}
	

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		String bandeiraCartao = "";
		
		System.out.println("Informe o número do cartão");
		String numeroCartao = tcd.next();
		
		if( numeroCartao.length() >= 13 && numeroCartao.length() <= 16  ) {
			
			boolean flag = checkValidade(numeroCartao);
			
			if( flag ) {
				System.out.println("Cartão Válido");
				bandeiraCartao = checkBandeiraCartao(numeroCartao.substring(0,1), 
						numeroCartao.substring(0,2));
				System.out.println("Bandeira " + bandeiraCartao);
			} else {
				System.out.println("Cartão Inválido");
			} 
			
		} else {
			System.out.println("Número de cartão inválido");
		} 
		
	}
	
}
