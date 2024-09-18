package br.com.busca.modelo;

public class Filme extends Titulo  {
	
	public Filme(TituloOmdb tituloOmdb) {
		super(tituloOmdb);
		// TODO Auto-generated constructor stub
	}

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
		public String toString() {
			return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
		}
}
