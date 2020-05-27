package aovivo27maio2020trescompainel;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MaiorTresNumeros {

	public static void main(String[] args) {
		
		double num1 = 0, num2 = 0, num3 = 0, maior =0;
		
		String priNum, segNum, terNum;
		
		try {
			
			priNum = JOptionPane.showInputDialog("Digite o primeiro numero");
			num1 = Double.parseDouble(priNum);
			
			segNum = JOptionPane.showInputDialog("Digite o segundo numero");
			num2 = Double.parseDouble(segNum);
			
			terNum = JOptionPane.showInputDialog("Digite o terceiro numero");
			num3 = Double.parseDouble(terNum);
			
			if(  num1 >= num2 && num1 >= num3) {
				maior = num1;
			} else if ( num2 >= num1 && num2 >= num3 ) {
				maior = num2;
			} else {
				maior = num3;
			}
			
			NumberFormat nf = new DecimalFormat("#,##0.00");
			
			JOptionPane.showMessageDialog(null, "O maior número é "+  nf.format(maior));
			
		} catch (Exception e ) {
			JOptionPane.showMessageDialog(null, "Falha "+ e.getMessage());
		}
		
	}
	
}
