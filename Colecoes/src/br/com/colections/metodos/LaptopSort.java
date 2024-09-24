package br.com.colections.metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import br.com.colections.modelos.Laptop;

class LaptopByIdComparator implements Comparator<Laptop> {

	@Override
	public int compare(Laptop l1, Laptop l2) {
		return  l1.getId().compareTo(l2.getId());
	}
	
}

public class LaptopSort {

	public static void main(String[] args) {
		List<Laptop> laptopList = new ArrayList<>();
		laptopList.add(new Laptop(5,"PH",2999.9));
		laptopList.add(new Laptop(3,"USAS",2700.5));
		laptopList.add(new Laptop(1,"Levono",1999.9));
		laptopList.add(new Laptop(2,"ISM",4000.0));
		laptopList.add(new Laptop(4,"Sunsamg",3750.0));
		
		LaptopByIdComparator comparador = new LaptopByIdComparator();
		
		System.out.println("Ordem de inserção:\n");
		System.out.println(laptopList.toString());
		
		Collections.sort(laptopList);
		
		System.out.println("\nOrdenado pelo nome:\n-----------------------\n");
		System.out.println(laptopList.toString());
		
		
		laptopList.sort(comparador);
		//Collections.sort(laptopList, comparador);
		
		//laptopList.sort(new LaptopByIdComparator());
		//Collections.sort(laptopList, new LaptopByIdComparator());
		
		System.out.println("\nOrdenado pelo ID:\n-----------------------\n");
		System.out.println(laptopList.toString());
	}	

}
