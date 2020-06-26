//seq-Junho-017

package aovivo24junho2020triangulo;

public class Desenhar {

	public static void main(String[] args) {
		
		int numeroLinhas = 10;
		
		for( int i=1; i<=numeroLinhas; i++ ) {
			
			for( int j=1 ; j<=i; j++ ) {
				System.out.print("col "+ j + " ");
			}
			
			System.out.println( " lin " + i );
			
		}
		
	}
	
}
