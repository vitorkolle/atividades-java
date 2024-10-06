package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.println("**************************************************");
		System.out.println("                  J O K E N P Ô                   ");
		System.out.println("**************************************************");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("--------------------------------------------------");
		System.out.println("Faça sua escolha (1 à 3) ");
		System.out.println("--------------------------------------------------");
		
		
		int escolhaUsuario = teclado.nextInt();
		int escolha = aleatorio.nextInt(3) + 1;
		
		if (escolhaUsuario == 1) {
			System.out.println("Você escolheu ------------> Pedra");
	     }
	    if (escolhaUsuario == 2) {
		System.out.println("Você escolheu ------------> Papel ");
		
	     }
	    if (escolhaUsuario == 3) {
		System.out.println("Você escolheu ------------> Tesoura ");
	    }
	    
	    if (escolha == 1) {
	    	System.out.println("O PC escolheu ------------> Pedra ");
		}
	    if (escolha == 2) {
	    	System.out.println("O PC escolheu ------------> Papel ");
		}
        if (escolha == 3) {
        	System.out.println("O PC escolheu ------------> Tesoura ");
		}	
	    
        if (escolhaUsuario == 1 && escolha == 2 || escolhaUsuario == 2 && escolha == 3 || escolhaUsuario == 3 && escolha == 1) {
		System.out.println("************************************************");
		System.out.println("*****************  QUE PENA! *******************");
		System.out.println("***************  O PC VENCEU   *****************");
		System.out.println("************************************************");
	    }
		if (escolhaUsuario == 2 && escolha == 1 || escolhaUsuario == 3 && escolha == 2 || escolhaUsuario == 1 && escolha == 3) {
			System.out.println("************************************************");
			System.out.println("*****************  PARABÉNS! *******************");
			System.out.println("***************  VOCÊ VENCEU  ******************");
			System.out.println("************************************************");
		}
		
		if (escolhaUsuario == escolha) {
			System.out.println("************************************************");
			System.out.println("*****************  EMPATE ! ********************");
			System.out.println("************************************************");
		}
		
		if (escolhaUsuario > 3 || escolhaUsuario < 1) {
			System.out.println("VALOR INVÁLIDO !!!!");
			
		}
			
			
		}
		
}
		

