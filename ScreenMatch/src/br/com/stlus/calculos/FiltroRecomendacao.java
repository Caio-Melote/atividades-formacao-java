package br.com.stlus.calculos;

public class FiltroRecomendacao {
	public void filtra(Classificavel classificavel) {
		if(classificavel.getClassificacao() >= 4) {
			System.out.println("Todo mundo está assistindo!!");
			
		} else if(classificavel.getClassificacao() >= 2) {
			System.out.println("Tem o seu publico!");
			
		} else {
			System.out.println("A classificação não é boa");
			
		}
	}
}
