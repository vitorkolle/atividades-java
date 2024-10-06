package br.senai.sp.jandira;

import java.util.Scanner;

public class MultiplosDeSeis {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Qual o valor 1?");
	int valor1 = teclado.nextInt();
	System.out.println("Qual o valor 2?");
	int valor2 = teclado.nextInt();
	int a = 0;
	
	if(valor1 < valor2) {
		while(valor1 < valor2) {
			
			if(valor1 % 6 == 0) {
				
				System.out.println(valor1);
				
			}
	     valor1 = valor1 + 1;
			
		
	}
		
	}else if(valor2 < valor1) {
		
		while(valor2 < valor1) {
			
			if(valor2 % 6 == 0) {
				
				System.out.println(valor2);
				
			}
			
			valor2 = valor2 + 1;
		} 
	}
System.out.println("F I M");
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
