package br.com.colections.metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListSort {

	public static void main(String[] args) {
		List<String> computer = new ArrayList<>(); 
		
		computer.add("Power Supply");
		computer.add("CPU");
		computer.add("GPU");
		computer.add("Storage");
		computer.add("Case");
		computer.add("Motherboard");
		computer.add("RAM");
		
		System.out.println("\n=------------------------------------------------------------------------=");
		System.out.println("Antes da ordenação: ");
		
		System.out.println(computer.toString());
		
		Collections.sort(computer);
		
		System.out.println("\nApós a ordenação: ");
		System.out.println(computer.toString());
		
		
		List<Double> number = new ArrayList<>(); 
		
		number.add(92.09);
		number.add(12d);
		number.add(87.34);
		number.add(24.56);
		number.add(50d);
		number.add(37.89);
		number.add(75d);
		
		System.out.println("\n=------------------------------------------------------------------------=");
		System.out.println("Antes da ordenação: ");
		
		for(double d : number) {
			System.out.println(d);
		}
		//System.out.println(number.toString());
		
		Collections.sort(number);
		
		System.out.println("\nApós a ordenação: ");
		
		for(double d : number) {
			System.out.println(d);
		}
		//System.out.println(number.toString());
		
	}

}
