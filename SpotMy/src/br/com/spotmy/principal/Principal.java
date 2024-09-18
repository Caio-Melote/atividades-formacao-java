package br.com.spotmy.principal;
import br.com.spotmy.modelo.Musica;
import br.com.spotmy.modelo.Podcast;

public class Principal {

	public static void main(String[] args) {
		Musica musica = new Musica();
		Podcast podcast = new Podcast();
		
		musica.setTitulo("Californication");
		musica.setGenero("Rock");
		musica.setAlbum("California");
		musica.setArtista("Red Hot Chili Peppers");
		musica.setDuracaoMinutos(3);
		
		podcast.setTitulo("Entendendo a plataforma Java");
		podcast.setTema("Tecnologia");
		podcast.setConvidado("Fabio Akita");
		podcast.setDuracaoMinutos(57.43);
		
		musica.shazam();
		musica.curtir();
		musica.reproduzir();
		musica.shazam();
		
		System.out.println("=-=-=-=-=-=-=-= PODCAST =-=-=-=-=-=-=-=-=-=");
		
		podcast.shazam();
		podcast.curtir();
		podcast.reproduzir();
		podcast.shazam();
	}

}
