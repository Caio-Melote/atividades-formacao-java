package br.com.stlus.modelos;

import br.com.stlus.calculos.Classificavel;

public class Episodio implements Classificavel {
	
	//Atributo
	private int numero;
	private String nome;
	private Serie serie;
	private int totalVisualizacao;
	
	//Getter
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Serie getSerie() {
		return serie;
	}
	
	public int getTotalVisualizacao() {
		return totalVisualizacao;
	}
	
	//Setter
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public void setTotalVisualizacao (int totalVisualizacao) {
		this.totalVisualizacao = totalVisualizacao;
	}
	
	@Override
	public int getClassificacao() {
		if (totalVisualizacao > 100) {
			return 4;
		} else {
			return 2;
		}
	}
}
