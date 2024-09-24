package br.com.colections.metodos;

import java.util.NavigableSet;
import java.util.TreeSet;

import br.com.colections.modelos.Smartphone;

public class NavigableSetTest {

	public static void main(String[] args) {
		NavigableSet<Smartphone> nSet = new TreeSet<>();
		Smartphone novoSmartphone = new Smartphone(123, "1a2b3c", "Maça", 17000.0);
		nSet.add(novoSmartphone);

	}

}
