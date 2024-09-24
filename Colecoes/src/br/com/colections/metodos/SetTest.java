package br.com.colections.metodos;

import java.util.HashSet;
import java.util.Set;

import br.com.colections.modelos.Perfumes;

public class SetTest {

	public static void main(String[] args) {
		
		//Necessita de um 'EQUALS' sobrescrito na classe 
		Set<Perfumes> setPerfumes = new HashSet<>(); //NÃO mantém a ordem de inserção
		
		//Set<Perfumes> setPerfumes = new LinkedHashSet<>(); //Usando 'LinkedHashSet' você mantém a ordem de inserção
		
		
		setPerfumes.add(new Perfumes(5, "KiaiK", 99.9, 5));
		setPerfumes.add(new Perfumes(3, "Two Bilion", 270.5 , 0));
		setPerfumes.add(new Perfumes(1, "121", 199.9 , 2));
		setPerfumes.add(new Perfumes(2, "ETANOL", 400.0 , 1));
		setPerfumes.add(new Perfumes(4, "Egel", 37.50 , 7));
		setPerfumes.add(new Perfumes(4, "Egel", 37.50 , 7));
		
		for(Perfumes p : setPerfumes) {
			System.out.println(p);
		}

	}

}
