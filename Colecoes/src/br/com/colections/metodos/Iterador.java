package br.com.colections.metodos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import br.com.colections.modelos.Perfumes;

public class Iterador {

	public static void main(String[] args) {
		
		List<Perfumes> listaPerfumes = new ArrayList<>();
		
		listaPerfumes.add(new Perfumes(5, "KiaiK", 99.9, 5));
		listaPerfumes.add(new Perfumes(3, "Two Bilion", 270.5 , 0));
		listaPerfumes.add(new Perfumes(1, "121", 199.9 , 2));
		listaPerfumes.add(new Perfumes(2, "ETANOL", 400.0 , 1));
		listaPerfumes.add(new Perfumes(4, "Egel", 37.50 , 7));
		
		System.out.println(listaPerfumes.toString());
		
		Iterator<Perfumes> iterador = listaPerfumes.iterator();
		
		while(iterador.hasNext()) {
			Perfumes p = iterador.next();
			if(p.getQuantidade() == 0) {
				iterador.remove();
			}
		}
		
		listaPerfumes.removeIf(m -> m.getQuantidade() == 0); //Forma mais simples utilizando lambda
		
		System.out.println(listaPerfumes.toString());
	}

}
