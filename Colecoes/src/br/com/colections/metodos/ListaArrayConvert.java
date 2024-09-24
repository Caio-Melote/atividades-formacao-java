package br.com.colections.metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConvert {
	public static void main(String[] args) {
		
		//Cria lista, (ArrayList), e transforma em Array
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		Integer[] arrayInteiros = numeros.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arrayInteiros));
		
		//Separador
		System.out.println("-------------");
		
		
		//Cria Array e transforma em lista(ArrayList) 
		Integer[] arrayNumeros = new Integer[3];
		arrayNumeros[0] = 1;
		arrayNumeros[1] = 2;
		arrayNumeros[2] = 3;
		
		List<Integer> arrayToList = Arrays.asList(arrayNumeros);
		
		arrayToList.set(0, 12); //Altera o valor da primeira posição do ArrayList e consequentemente altera o Array
		//arrayToList.add(25); //Fazer operação de adição irá trazer um erro como consequência
		
		System.out.println(Arrays.toString(arrayNumeros));
		System.out.println(arrayToList);
		
		//Separador
		System.out.println("-------------");
		
		//Cria o ArrayList pegando os dados do Array mas sem vincular os dois
		List<Integer> arrayListNumeros = new ArrayList<>(Arrays.asList(arrayNumeros));
		arrayListNumeros.add(25);
		System.out.println(arrayListNumeros.toString());
	}
}
