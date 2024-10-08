import java.util.ArrayList;
import java.util.List;

import br.com.stlus.calculos.CalculadoraTempo;
import br.com.stlus.calculos.FiltroRecomendacao;
import br.com.stlus.modelos.Episodio;
import br.com.stlus.modelos.Filme;
import br.com.stlus.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme(); // Tipo por referência
		meuFilme.setNome("Homem Aranha");
		meuFilme.setAnoLancamento(2003);
		meuFilme.setDuracaoMinutos(210);

		Filme nossoFilme = new Filme(); // Tipo por referência
		nossoFilme.setNome("Thor");
		nossoFilme.setAnoLancamento(2013);
		nossoFilme.setDuracaoMinutos(175);

		var aqueleFilme = new Filme(); // VAR é uma inferência
		aqueleFilme.setNome("Duna");
		aqueleFilme.setAnoLancamento(2022);
		aqueleFilme.avaliaTitulo(7);
		aqueleFilme.setDuracaoMinutos(340);

		ArrayList<Filme> listaFilmes = new ArrayList<>();

		listaFilmes.add(nossoFilme);
		listaFilmes.add(meuFilme);
		listaFilmes.add(aqueleFilme);
		System.out.println("--> Tamanho da lista: " + listaFilmes.size());
		System.out.println("--> .toString do objeto >>> " + listaFilmes.get(2).toString());
		System.out.println("--> Tamanho da lista: " + listaFilmes.get(2).getNome() + "\n\n");

		meuFilme.avaliaTitulo(10);
		meuFilme.avaliaTitulo(7);
		meuFilme.avaliaTitulo(8);

		aqueleFilme.mostraDados();

		// System.out.println("\n" + meuFilme.somaAvaliacao); //Agora está privado
		// System.out.println(meuFilme.quantidadeAvaliacao); //Agora está privado
		System.out.println("Quantidade com GET: " + meuFilme.getQuantidadeAvaliacao());
		System.out.println(meuFilme.mediaAvaliacao() + "\n");

		Serie minhaSerie = new Serie();
		minhaSerie.setNome("Regular Show");
		minhaSerie.setAnoLancamento(2014);
		minhaSerie.setTemporadas(7);
		minhaSerie.setEpisodiosTemporada(10);
		minhaSerie.setMinutosPorEpisodio(17);
		minhaSerie.mostraDados();
		System.out.println("Duração de toda a serie: " + minhaSerie.getDuracaoMinutos());

		CalculadoraTempo calculadora = new CalculadoraTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(nossoFilme);
		calculadora.inclui(minhaSerie);
		System.out.println("\nDuração total: " + calculadora.getTempoTotal());

		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);

		Episodio episodio = new Episodio();
		episodio.setNumero(8);
		episodio.setSerie(minhaSerie);
		episodio.setTotalVisualizacao(400);
		filtro.filtra(episodio);
	}
}
