package br.com.stlus.modelos;

public class Titulo {
	
	//Atributos
		private String nome;
		private int anoLancamento;
		private boolean incluidoAssinatura;
		private double somaAvaliacao;
		private int quantidadeAvaliacao;
		private int duracaoMinutos;
		
		//Getter
		public String getNome() {
			return nome;
		}
		
		public int getAnoLancamento() {
			return anoLancamento;
		}
		
		public boolean getIncluidoAssinatura() {
			return incluidoAssinatura;
		}

		public double getSomaAvalicao() {
			return somaAvaliacao;
		}

		public int getQuantidadeAvaliacao() {
			return quantidadeAvaliacao;
		}
		
		public int getDuracaoMinutos() {
			return duracaoMinutos;
		}
		
		//Setter
		public void setNome (String nome) {
			this.nome = nome;
		}
		
		public void setAnoLancamento (int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}
		
		public void setIncluidoAssinatura(boolean incluidoAssinatura) {
			this.incluidoAssinatura = incluidoAssinatura;
		}

		public void setSomaAvalicao(double somaAvaliacao ) {
			this.somaAvaliacao = somaAvaliacao;
		}

		public void setQuantidadeAvaliacao(int quantidadeAvaliacao) {
			this.quantidadeAvaliacao = quantidadeAvaliacao;
		}
		
		public void setDuracaoMinutos (int duracaoMinutos) {
			this.duracaoMinutos = duracaoMinutos;
		}
		
		//Métodos 
		public void mostraDados() {
			System.out.println("* Nome do título: " + nome);
			System.out.println("* Ano do lançamento: " + anoLancamento);
			System.out.println("* Está incluido na assinatura: " + incluidoAssinatura);
			System.out.println("* Duração: " + duracaoMinutos + " minutos");
			System.out.println("* Soma das avaliações: " + somaAvaliacao);
			System.out.println("* Quantidade de avaliações: " + quantidadeAvaliacao + "\n");
		}
		
		public void avaliaTitulo(double nota) {
			somaAvaliacao += nota;
			quantidadeAvaliacao++;
		}
		
		public double mediaAvaliacao() {
			return (somaAvaliacao / quantidadeAvaliacao);
		}
}
