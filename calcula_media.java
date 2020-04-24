package mysecondproject;
import java.util.Scanner;
//recurso que permite ler o teclado

public class CalculaMedia {

	public static void main( String args[] ) { 
		
		double note1;
		double note2;
		double note3;
		double media;
		String studentName;
		Scanner tcd = new Scanner(System.in);
		//tcd representa a entrada via teclado
		System.out.println("Digite média 1o trim e tecle ENTER");
		note1 = tcd.nextDouble();
		System.out.println("Digite média 2o trim e tecle ENTER");
		note2 = tcd.nextDouble();
		System.out.println("Digite média 3o trim e tecle ENTER");
		note3 = tcd.nextDouble();
		System.out.println("Qual nome do aluno? e tecle ENTER");
		studentName = tcd.next();
		media = (note1 + note2 * 2 + note3 * 2) / 5;
		if ( media >= 6 ) {
			System.out.println( studentName + " aprovado");
		} else {
			System.out.println ( "Ihhh RePRoVaDo " + studentName);
		}
				
	}
	
}
