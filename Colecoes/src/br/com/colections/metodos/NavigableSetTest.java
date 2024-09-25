package br.com.colections.metodos;

import java.util.NavigableSet;
import java.util.TreeSet;

import javax.xml.crypto.Data;

import br.com.colections.modelos.Smartphone;

public class NavigableSetTest {

	public static void main(String[] args) {
		// É necessário implementar um comparable na classe do objeto, se não criar uma
		// classe 'compare' aqui na main
		NavigableSet<Smartphone> nSet = new TreeSet<>();

		// 1ª Forma de adicionar
		nSet.add(new Smartphone(121, "99", "Arec", 0));
		nSet.add(new Smartphone(22, "88", "Best", 0));
		nSet.add(new Smartphone(37, "77", "Ciao", 0));
		nSet.add(new Smartphone(8, "55", "HP", 0));

		// 2ª Forma de adicionar
		Smartphone novoSmartphone = new Smartphone(10, "65", "Dellet", 0);
		nSet.add(novoSmartphone);

		System.out.println("Resultado: \n" + nSet.toString());

		//Tudo verificado pelo nome da marca
		System.out.println("=-=-=-=-=-=-=-=-=-==--"); 
		System.out.println("\n-----------\nLower: " + nSet.lower(novoSmartphone));
		System.out.println("\n-----------\nHigher: " + nSet.higher(novoSmartphone));
		System.out.println("\n-----------\nFloor: " + nSet.floor(novoSmartphone));
		System.out.println("\n-----------\nCeiling: " + nSet.ceiling(novoSmartphone));
	}

}
