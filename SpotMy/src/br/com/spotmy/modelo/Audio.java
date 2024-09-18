package br.com.spotmy.modelo;

public class Audio {
	private String titulo;
	private double duracaoMinutos;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	//Getter 
	public String getTitulo() {
		return titulo;
	}
	
	public double getDuracaoMinutos() {
		return duracaoMinutos;
	}
	
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
	
	//Setter
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDuracaoMinutos(double duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	
	
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	public void curtir() {
		System.out.println("\n -=-=-=-= Áudio curtido!! =-=-=-=-\n");
		this.totalCurtidas++;
	}
	
	public void reproduzir() {
		String mensagem = String.format("""
				  - >PLAY< - 
				Reproduzindo: %s
				""", titulo);
		System.out.println(mensagem);
		this.totalReproducoes++;
	}
	
	public void shazam() {
		String mensagem = String.format("""
				--> ANALIZANDO ÁUDIO <--
				....
				* O áudio que está tocando se chama: %s
				* Duração: %.2f minutos
				* Curtidas: %d
				* Reproduções: %d
				* Classificação: %d""", titulo,duracaoMinutos,totalCurtidas,totalReproducoes,classificacao);
		System.out.println(mensagem);
	}
	
}
