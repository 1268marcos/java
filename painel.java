package aovivo20maio2020painel;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Painel {

	public static void main(String[] args) {
		double baseMaior, baseMenor, area;
		String baseDigitadaMaior, baseDigitadaMenor;
		baseDigitadaMaior = JOptionPane.showInputDialog("Digite o lado maior");
		baseDigitadaMenor = JOptionPane.showInputDialog("Digite o lado menor");
		
		baseMaior = Double.parseDouble(baseDigitadaMaior);
		baseMenor = Double.parseDouble(baseDigitadaMenor);
		
		area = baseMaior*baseMenor;
		NumberFormat nf = new DecimalFormat("#,##0.00");
		
		JOptionPane.showMessageDialog(null, "Area calculada " + nf.format(area) );		
		
	}
	
}

