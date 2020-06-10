//seq-junho-006

package aovivo10junho2020lanchonete;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Conta {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		//   Escreva ("Algoritmo para calcular o valor da sua comida")
		System.out.println( "Algoritmo para calcular o valor da sua comida" );
		
		double ham = 0 , che = 0, fri = 0, ref = 0, mil = 0;
		String strHam  , strChe , strFri , strRef , strMil;
		
		strHam = JOptionPane.showInputDialog("Digite quantos hambúrguers você comeu: ");
		ham = Double.parseDouble(strHam);
		
		strChe = JOptionPane.showInputDialog("Digite quantos cheeseguers você comeu: ");
		che = Double.parseDouble(strChe);
		
		strFri = JOptionPane.showInputDialog("Digite quantas fritas você comeu: ");
		fri = Double.parseDouble(strFri);
		
		strRef = JOptionPane.showInputDialog("Digite quantos refrigerante você bebeu: ");
		ref = Double.parseDouble(strRef);
		
		strMil = JOptionPane.showInputDialog("Digite quantos milkshakes você bebeu: ");
		mil = Double.parseDouble(strMil);
				
		double valorConta=0;
		valorConta = (ham * 3) + (che * 2.5) + (fri * 2.5) + (ref * 1) + (mil *3) ;
		
		NumberFormat nf = new DecimalFormat("#,##0.00");
		
		JOptionPane.showMessageDialog(null, "A sua conta é " + nf.format(valorConta));
		
		
	}
	
}
