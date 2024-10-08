package br.com.stlus.modelos;

import br.com.stlus.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
	
	//Atributos
	
	private int temporadas;
	private int episodiosTemporada;
	private boolean encerrada;
	private int minutosPorEpisodio;
	
	//Getter
	
	public int getTemporadas() {
		return temporadas;
	}
	
	public int getEpisodiosTemporada() {
		return episodiosTemporada;
	}
	
	public boolean getEncerrada() {
		return encerrada;
	}
	
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	
	//Setter
	
	public void setTemporadas (int temporadas) {
		this.temporadas = temporadas;
	}
	
	public void setEpisodiosTemporada (int episodiosTemporada) {
		this.episodiosTemporada = episodiosTemporada;
	}
	
	public void setEncerrada (boolean encerrada) {
		this.encerrada = encerrada;
	}
	
	public void setMinutosPorEpisodio (int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	@Override
	public int getDuracaoMinutos() {
		return temporadas * episodiosTemporada * minutosPorEpisodio;
	}
	
	@Override
	public int getClassificacao() {
		return (int) mediaAvaliacao() / 2;
	}
}
