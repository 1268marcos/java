package aovivo27maio2020maiortresnumeros;

public class MaiorTresNumeros {

	public static void main(String[] args) {
		
		int num1 = 18, num2 = 20, num3 = 73;
		System.out.println("Os numeros são " + num1 + ", " + num2 + " e " + num3);
		
		//logica 1
		if( num1 >= num2 && num1 >= num3 ) {
			System.out.println(num1 + " é o maior numero");
		} else if ( num2 >= num1 && num2 >= num3 ) {
			System.out.println(num2 + " é o maior numero");
		} else {
			System.out.println(num3 + " é o maior numero");
		}
		
		//if() {} else if () {} else {}
		
		//logica 2
		System.out.println("Esos son los numeros " + num1 + ", " + num2 + " e " + num3);
		if( num1 >= num2) {
			if(num1 >= num3) {
				System.out.println(num1 + " es el mayor numero");
			} else {
				System.out.println(num3 + " es el mayor numero");
			}
		} else {
			if( num2 >= num3) {
				System.out.println(num2 + " es el mayor numero");
			} else {
				System.out.println(num3 + " es el mayor numero");
			}
		}
		
	}
	
}
