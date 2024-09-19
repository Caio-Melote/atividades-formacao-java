package br.com.divisao.principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		int menu = 0, numerador = 0, denominador = 0, resultado = 0;
		double resto = 0;
		do {
			System.out.println("\nDigite o valor do numerador: ");
			numerador = escaneador.nextInt();
			
			System.out.println("\nDigite o valor do denominador: ");
			denominador = escaneador.nextInt();
			try {
				resultado = numerador / denominador;
				resto = numerador % denominador;
				System.out.println("\nO resultado de "+ numerador + "/" + denominador + " é: " + resultado + "\nResto da divisão = " + resto);
			} catch (ArithmeticException e) {
				System.out.println("O erro é: " + e);
			}
			
			System.out.println("\nDigite 1 para continuar e 0 para encerrar: ");
			menu = escaneador.nextInt();
			
		} while (menu != 0);
		
		escaneador.close();
	}
}
