package aovivo22abril2020a;

import java.util.Scanner;

public class Temperatura {
	
	  Scanner tcd = new Scanner(System.in);
	    int cels;

	    public Temperatura() {
	    	
	        System.out.println("Entre com a temperatura Fahrenheit: ");
	        
	        setCels(tcd.nextInt());
	        
	        System.out.println("A Temperatura convertida é de: " + getCels() + "ºC");
	    }

	    public int getCels() {
	        return cels;
	    }

	    public void setCels(int cels) {
	        this.cels = (cels - 32) * 5 / 9;
	    }
}
