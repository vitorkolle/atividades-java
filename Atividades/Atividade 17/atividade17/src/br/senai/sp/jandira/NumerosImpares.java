package br.senai.sp.jandira;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	 
	int a [] = new int [6], soma = 0, vFinal = 0;
	
	System.out.println("Digite os valores desejados");
	a[0] = teclado.nextInt();
	a[1] = teclado.nextInt();
	a[2] = teclado.nextInt();
	a[3] = teclado.nextInt();
	a[4] = teclado.nextInt();
	a[5] = teclado.nextInt();

	
	for(int rep = 0; rep < a.length; rep++) {
		 if (a[rep] % 2 != 0) {
				soma += a[rep];	
		}
} 
	System.out.println("O resultado final é: " + soma );	
	
	
	
	
	
	
	
	}

}
