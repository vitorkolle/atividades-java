package br.senai.sp.jandira;

import java.util.Iterator;

public class calculoVetores {

	public static void main(String[] args) {
	
	
		int a[] = new int [10];
		int b[] = new int [10];
		
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
	
		
		
		System.out.println("--------------------------------------");
		System.out.println("          Valores da Matriz B         ");
        System.out.println("--------------------------------------");
		
		for(int c = 0; c <= 9; c++) {
			
			if (c % 2 == 0) {
				b[c] = a[c] * 5;
				System.out.println("b" + "[" + c + "] =  " + b[c]);
	}else {
		
	b[c] = a[c] + 5;
	System.out.println("b" + "[" + c + "] =  " + b[c]);
	
			
			
			
			
	}
		}
			
			
		}
		
			
			
	
		
	
		
		
}
		
		
		
		
		
		
		





