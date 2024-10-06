package br.senai.sp.jandira;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o multiplicando?");
		int multiplicando = teclado.nextInt();
		System.out.println("Qual o menor multiplicador?");
		int menorMultiplicador = teclado.nextInt();
		System.out.println("Qual o maior multiplicador?");
		int maiorMultiplicador = teclado.nextInt();
		System.out.println("                           ");
		
		System.out.println("Tabuada do " + multiplicando);
	    System.out.println("---------------------------");
		
	    while(menorMultiplicador <= maiorMultiplicador) {
	    	System.out.println(multiplicando + " X " + menorMultiplicador + " = " + multiplicando * menorMultiplicador);
	    	
	       menorMultiplicador = menorMultiplicador + 1;
}
	    
        System.out.println("---------------------------");
	    System.out.println("F I M");
		
		
	}

}
