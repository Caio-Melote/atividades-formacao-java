package br.com.spotmy.modelo;

public class Podcast extends Audio {
	private String tema;
	private String convidado;
	
	//Getter
	public String getTema() {
		return tema;
	}
	
	public String getConvidado() {
		return convidado;
	}
	
	//Setter
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public void setConvidado(String convidado) {
		this.convidado = convidado;
	}
	
	@Override
    public void shazam() {
        super.shazam();
        System.out.print("* Tema:" + tema);
        System.out.print("\n* Convidado:" + convidado + "\n\n");
    }
}
