package br.com.colections.metodos;

import java.util.NavigableSet;
import java.util.TreeSet;

import br.com.colections.modelos.Smartphone;

public class NavigableSetTest {

	public static void main(String[] args) {
		// É necessário implementar um comparable na classe do objeto, se não criar uma
		// classe 'compare' aqui na main
		NavigableSet<Smartphone> nSet = new TreeSet<>();

		// 1ª Forma de adicionar
		nSet.add(new Smartphone(1, "1a2b3c", "Maça", 9899));
		nSet.add(new Smartphone(2, "z1x2y3", "Sumsang", 7600));
		nSet.add(new Smartphone(3, "a9b8c7", "Konia", 5400));
		nSet.add(new Smartphone(8, "1a2b3c", "Generic", 1999));

		// 2ª Forma de adicionar
		Smartphone novoSmartphone = new Smartphone(123, "1a2b3c", "Maça", 17000.0);
		nSet.add(novoSmartphone);

		System.out.println("Resultado: \n" + nSet.toString());

		System.out.println("=-=-=-=-=-=-=-=-=-==--");
		System.out.println("Lower: " + nSet.lower(novoSmartphone));
	}

}
