package br.senai.sp.jandira;

import java.util.Scanner;

public class Subtracao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------");
        System.out.print("Qual o primeiro valor? ");
        int valor1 = teclado.nextInt();
        
        
        System.out.print("Qual o segundo valor? ");
        int valor2 = teclado.nextInt();
        System.out.println("-----------------------------------------------");
        
        System.out.println("Resultado:");
       
        if (valor1 >= valor2) {
			System.out.println(valor1 - valor2);
		}
        else {
        	System.out.println(valor2 - valor1);
        	
        }
        
        
        
	
	
	
	
	}

}
