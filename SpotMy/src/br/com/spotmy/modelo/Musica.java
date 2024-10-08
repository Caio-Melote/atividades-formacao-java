package br.com.spotmy.modelo;

public class Musica extends Audio {
	private String album;
	private String genero;
	private String artista;
	
	//Getter
	public String getAlbum() {
		return album;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getArtista() {
		return artista;
	}
	
	//Setter
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	@Override
    public void shazam() {
        super.shazam();
        System.out.print("* Artista:" + artista + "\n\n");
    }
}
