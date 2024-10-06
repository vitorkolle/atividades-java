package br.senai.sp.jandira;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("Quantos anos você tem?");
	
	int idade = teclado.nextInt() * 365;
	
	System.out.println("Você já viveu aproximadamente "  + idade * 365 +  " dias!");
	
	
	

	}

}
