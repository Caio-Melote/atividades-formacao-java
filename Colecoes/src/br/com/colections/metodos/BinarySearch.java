package br.com.colections.metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.colections.modelos.Laptop;

public class BinarySearch {

	public static void main(String[] args) {
		
		LaptopByIdComparator comparadorLaptopID = new LaptopByIdComparator();
		
		List<Laptop> laptopList = new ArrayList<>();
		laptopList.add(new Laptop(5,"PH",2999.9));
		laptopList.add(new Laptop(3,"USAS",2700.5));
		laptopList.add(new Laptop(1,"Levono",1999.9));
		laptopList.add(new Laptop(2,"ISM",4000.0));
		laptopList.add(new Laptop(4,"Sunsamg",3750.0));
		
//		for(Laptop laptop : laptopList) {
//			System.out.println(laptop);
//		}
		
		//Ordenação por nome
		Collections.sort(laptopList);
		
		System.out.println("Ordenação por nome:");
		System.out.println("\n\n"+ laptopList.toString());
		
		Laptop laptopSearch  = new Laptop(2,"ISM",4000.0);
		
		System.out.println("\nPosição resultante da busca binária: " + Collections.binarySearch(laptopList, laptopSearch));
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		laptopList.sort(comparadorLaptopID);
		
//		System.out.println("Ordenação pelo ID:\n");
//		for(Laptop l : laptopList) {
//			System.out.println(l);
//		}
				
		System.out.println("Ordenação por ID personalizada:");
		System.out.println(laptopList.toString());
		
		System.out.println("\nPosição resultante da busca binária: " + Collections.binarySearch(laptopList, laptopSearch,comparadorLaptopID));
	}

}
