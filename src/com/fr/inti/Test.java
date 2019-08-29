package com.fr.inti;

import java.util.Scanner;

public class Test {
	private static Scanner scanner = new Scanner(System.in);
	
	public int calculSomme(int a, int b) {
		return a + b;
	}

	public int calculProduit(int a, int b) {
		return a * b;
	}

	public void permutationNombre(int a, int b) {
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	public static void divisionEuclidienne() {
		System.out.print("Entrez a: ");
        int a = scanner.nextInt();
 
        System.out.print("Entrez b: ");
        int b = scanner.nextInt();
        if(b!=0)
        {
        	System.out.println("le quotient: "+ a/b);
        	System.out.println("le reste est: "+ a%b);
        }
        else
        {
        	System.out.println("entrer un nombre valide!!!");
        }
	}

	public static void main(String[] args) {
		divisionEuclidienne();

	}

}
