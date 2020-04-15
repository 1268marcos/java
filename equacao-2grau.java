package aovivo15abril2020;

public class CalculaRaizes {
	
	public static void main(String[] args) {
		
		double a = 0;
		double b = -3;
		double c = 22;
		
		//double delta = b*b - 4 * a * c;
		double delta = Math.pow(b, 2) - 4 * a * c;
		 
		double x1 = ( (b * -1) + Math.sqrt(delta) ) / (2 * a);
		
		double x2 = ( (b * -1) - Math.sqrt(delta) ) / (2 * a);
		
		System.out.println("Valor do delta = " +  delta);
		
		System.out.println("Raiz '    " + x1);
		
		System.out.println("Raiz ''   " + x2);
		
	}	

}
