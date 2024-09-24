package br.com.colections.metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BinarySearchTest {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		int buscaRes = 0;
		
		numeros.add(2);
		numeros.add(6);
		numeros.add(3);
		numeros.add(1);
		
		//Necessário ordenar antes da busca binária
		Collections.sort(numeros);
		buscaRes = Collections.binarySearch(numeros, 6);
		System.out.println(buscaRes);
	}
}
