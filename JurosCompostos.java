package aovivo13maio2020juroscompostos;

public class JurosCompostos {

	public static void main(String[] args) {
		
		double valorfinal, p, t, r, n;
		p=2000.0;
		t=5;
		r=0.08;
		n=12;
		
		valorfinal = p * Math.pow(1 + (r/n) , n*t);
		System.out.println("Valor apos " + t + " anos: " + valorfinal);
		
		double juroscalculado = valorfinal - p;
		System.out.println("Juros compostos " + juroscalculado);
		//String.format    java
	}
	
}
