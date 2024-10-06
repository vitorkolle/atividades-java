package br.senai.sp.jandira;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		
		System.out.println("Qual o seu peso em Kg?");
		int peso = teclado.nextInt();
		
		System.out.println("Qual a sua altura em M?");
		double altura = teclado.nextDouble();
		
		System.out.println("Olá " +nome+ "! Seu IMC é " + peso * Math.pow(altura, 2));
		
		
		

	}

}
