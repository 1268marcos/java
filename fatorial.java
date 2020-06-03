package aovivo03junho2020fatorial;
//seq-Junho-002
public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;
		// declaracao da variavel fatorial do tipo numero inteiro com valor 1
		
		int numeroCaracteres = 6;
		// declaracao da variavel numeroCaracteres do tipo numero inteiro com valor 6
		
		//for( int i = 1; i <= numeroCaracteres; i++ ) {
		//	fatorial = fatorial * i;
		//}
		
		int i = 1;
		// declaracao da variavel i do tipo numero inteiro com valor 1
		
		while( i <= numeroCaracteres ) {
		// estrutura de repeticao enquanto expressao logica       for verdadeira
		//                                 i <= numeroCaracteres
			fatorial = fatorial * i;
			// a variavel fatorial recebe a variavel fatorial multiplicada pela  variavel i
			i++;
			// somando 1 unidade na variavel i
		}
		
		System.out.println("Fatorial "+ numeroCaracteres + " são as possibilidades " + fatorial );
		
	}
	
}
