package br.com.colections.metodos;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> mapeamento = new HashMap<>();

		mapeamento.put("aiphone", "iPhone");
		mapeamento.put("apleu", "Apple");
		mapeamento.put("aipod", "iPod");
		mapeamento.put("aipad", "iPad");
		
		//1ª maneira de imprimir
		System.out.println("toString do mapeamento: " + mapeamento + "\n");
		
		//2ª maneira de imprimir
		for (String estringue : mapeamento.keySet()) {
			System.out.println(estringue + " : " + mapeamento.get(estringue));
		}
		
		System.out.println("\n ----------------------------- \n");
		
		//3ª maneira de imprimir
		for (Map.Entry<String, String> entry : mapeamento.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

}
