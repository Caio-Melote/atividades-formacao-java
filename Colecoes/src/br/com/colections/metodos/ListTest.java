package br.com.colections.metodos;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		//Versão 1.4 do Java
		/*
		List nomes = new ArrayList();
		nomes.add("Caio");
		nomes.add("Melo");
		
		for(Object n: nomes) {
			System.out.println(n);
		}
		*/
		
		List<String> nomes = new ArrayList<>();
		List<String> nomes02 = new ArrayList<>();
		nomes.add("Caio");
		nomes.add("Melo");
		
		nomes02.add("Mateus");
		nomes02.add("Simon");
		
		System.out.println("Impressão com FOR iterando cada item");
		for(String s : nomes) {
			System.out.println(s);
		}
		
		System.out.println("\n----------------------------\n");
		
		System.out.println("Impressão com FOR pelo tamanho da lista");
		nomes.add("Jhon");
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("\n----------------------------\n");
		
		System.out.println("Impressão utilizando 'toString' da lista");
		System.out.println(nomes.remove("Jhon")); //Remove traz um retorno booleano
		System.out.println(nomes.toString());
		
		System.out.println("\n----------------------------\n");
		
		nomes.addAll(nomes02);
		System.out.println("Impressão com adição de outra lista usando 'addAll' ");
		System.out.println(nomes.toString());
	}

}
