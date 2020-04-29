package aovivo29abril2020string;

public class EstudoString {

	public static void main(String[] args) {
		
		String s1 = "Professor Marcos é Lindo";
		int x = 307;
		
		String s2 = s1 + " " +  x;
		//          Professor Marcos é Lindo 307
		
		String s3 = s2.substring(10, 16);

		String s4 = "é legal";
		
		String s5 = s3 + " " + s4;
		System.out.println(s5);
		
		int totalCaracteres = s5.length();
		System.out.println(totalCaracteres);
		
	}
	
}
