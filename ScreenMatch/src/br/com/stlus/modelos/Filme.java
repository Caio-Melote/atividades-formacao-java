package br.com.stlus.modelos;

import br.com.stlus.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
	
	//Atributo
	private double bilheteria;
	
	//Getter
	public double getBilheteria () {
		return bilheteria;
	}
	
	//Setter
	public void setBilheteria (double bilheteria) {
		this.bilheteria = bilheteria;
	}
	
	@Override
	public int getClassificacao() {
		return (int) mediaAvaliacao() / 2;
	}
	
	@Override
	public String toString() {
		return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
	}
}
	