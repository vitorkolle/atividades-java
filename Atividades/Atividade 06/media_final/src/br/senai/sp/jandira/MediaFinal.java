package br.senai.sp.jandira;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o nome do Aluno?");
		String nomeDoAluno = teclado.nextLine();
		
		
		System.out.println("Qual a nota do primeiro bimestre?");
		double nota1 = teclado.nextDouble();
		
		
		System.out.println("Qual a nota do segundo bimestre?");
		double nota2 = teclado.nextDouble();
		
		
		System.out.println("Qual a nota do terceiro bimestre?");
		double nota3 = teclado.nextDouble();
		
		
		System.out.println("Qual a nota do quarto bimestre?");
		double nota4 = teclado.nextDouble();
		
		double notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
				
		
		System.out.println("*************************************");
        System.out.println("            MÉDIA FINAL              ");
        System.out.println("*************************************");
        System.out.println("                                     ");
        
        System.out.println("Nome do alino: " + nomeDoAluno);
        System.out.println("Nota do primeiro bimestre: " + nota1);
        System.out.println("Nota do segundo bimestre: " + nota2);
        System.out.println("Nota do terceiro bimestre: " + nota3);
        System.out.println("Nota do quarto bimestre: " + nota4);
        System.out.println("                                     ");
        
        System.out.println("-------------------------------------");
        System.out.println(nomeDoAluno + ", a sua nota final é: " + notaFinal );
        System.out.println("-------------------------------------");
        
        if(notaFinal >= 6) {
        	System.out.println(nomeDoAluno + ", a sua nota final é " + notaFinal );
        	System.out.println("PARABÉNS!! VOCÊ FOI APROVADO!!");
        	
        }
      
        else {
        System.out.println( nomeDoAluno + ", a sua nota final é " + notaFinal );
        System.out.println("QUE PENA!!VOCÊ FOI REPROVADO");
        
       }
        
        
        
        
        
        
        
        
        
	}

}
