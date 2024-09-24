package br.com.colections.metodos;

import java.util.ArrayList;
import java.util.List;

import br.com.colections.modelos.Smartphone;

public class ListSmartphone {

	public static void main(String[] args) {
		Smartphone s1 = new Smartphone(1,"1a2b3c","Maça",9899);
		Smartphone s2 = new Smartphone(2,"z1x2y3","Sumsang",7600);
		Smartphone s3 = new Smartphone(3,"a9b8c7","Konia",5400);
		Smartphone s4 = new Smartphone(8,"1a2b3c","Generic",1999);
		
		List<Smartphone> listSmartphone = new ArrayList<>();
		
		listSmartphone.add(s3);
		listSmartphone.add(s2);
		listSmartphone.add(s1);
		
		for(Smartphone s: listSmartphone) {
			System.out.println(s);
		}
		
		System.out.println("\n----------------------------\n");
		
		
		//Verificando se a lista contém o objeto atravéz do '.contains()' pelo serialNumber
		System.out.println("Verificando se a lista contém o objeto atravéz do '.contains()' pelo serialNumber: ");
		System.out.println(listSmartphone.contains(s4));
		
		//Encontrando o index do objeto que contém o mesmo 'serialNumber'
		int index = listSmartphone.indexOf(s4); //Caso não encontre ninguem com o mesmo indice, o retorno é -1
		System.out.println("\nIndex s4: \n" + index);
		
		if(index == -1) {
			System.out.println("\nO objeto não existe na lista");
			listSmartphone.add(s4);
		}else {
		System.out.println("\nImprimindo o objeto da posição index retornada: " + listSmartphone.get(index));
		}
		
	}

}
