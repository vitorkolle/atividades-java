package br.senai.sp.jandira;

import java.util.Scanner;

public class Subtracaovetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a[] = new int[6];
		int b[] = new int[6];
		int c[] = new int[6];
		 int i = 0;
		
		System.out.println("------------------------------------");
		System.out.println("Digite os seis valores da Matriz A: ");
		System.out.println("------------------------------------");
		a[0] = teclado.nextInt();
		a[1] = teclado.nextInt();
		a[2] = teclado.nextInt();
		a[3] = teclado.nextInt();
		a[4] = teclado.nextInt();
		a[5] = teclado.nextInt();
		
		System.out.println("------------------------------------");
		System.out.println("Digite os seis valores da Matriz B: ");
		System.out.println("------------------------------------");
		b[0] = teclado.nextInt();
		b[1] = teclado.nextInt();
		b[2] = teclado.nextInt();
		b[3] = teclado.nextInt();
		b[4] = teclado.nextInt();
		b[5] = teclado.nextInt();
		
		
		System.out.println("*************************************");
		
	   
		while(i < 6) {
			c[i] = a[i] - b[i];
			System.out.println(c[i]);
		i++;
			}
		
		
		System.out.println("************************************");
		System.out.println("                F I M               ");
		System.out.println("************************************");
		

	}

}
