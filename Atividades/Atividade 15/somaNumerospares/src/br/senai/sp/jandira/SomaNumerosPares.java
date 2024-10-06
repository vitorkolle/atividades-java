package br.senai.sp.jandira;

public class SomaNumerosPares {

	public static void main(String[] args) {
		
		int b = 0;
		
		
		for(int a = 1; a <= 50; a++) {
			if(a % 2 == 0) {
				
				System.out.println(a);
			    b += a;
}
			
		} System.out.println("-------------------");
		System.out.println(b);
		
	}

}
