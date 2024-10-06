package br.senai.sp.jandira;

import java.util.Scanner;

public class GastoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		
	System.out.println("-----------------------------------------------------------------");
	System.out.println("                   CONSUMO DE COMBUSTÍVEL                        ");
	System.out.println("-----------------------------------------------------------------");
	

	
	
	System.out.print("Modelo do veículo:");
	String modeloDoVeiculo = teclado.next();
	
	System.out.print("Autonomia do veículo:");
	double autonomia = teclado.nextDouble();
	
	System.out.print("Distância da viagem:");
	double distancia = teclado.nextDouble();
	
	System.out.print("Preço do combustível:");
	double precoCombustivel = teclado.nextDouble();
	
	double quantidade = distancia / autonomia;
	
	System.out.println("                                                                 ");
	
	System.out.println("-----------------------------------------------------------------");
	System.out.println("                       R E S U L T A D O                         ");
	System.out.println("-----------------------------------------------------------------");
	
	System.out.println("Modelo do veículo: " + modeloDoVeiculo);
	System.out.println("Autonomia do veículo: " + autonomia + " Km/L");
	System.out.println("Distância percorrida:" + distancia + "Km");
	System.out.println("Preço do combustível:R$ " + precoCombustivel);
	System.out.println("                                                                 ");
	System.out.println("-----------------------------------------------------------------");
	 
	System.out.println("Quantidade de combustível utilizado:" + quantidade + " L");
	System.out.println("Total gasto com a viagem:R$ " + quantidade*precoCombustivel);
	System.out.println("-----------------------------------------------------------------");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
