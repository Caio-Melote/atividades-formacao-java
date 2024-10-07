package br.com.consumirpersistir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personagem")
public class Personagem {
	
	@Id
	private Integer id;
	@Column(name = "nome")
	private String name; 
	@Column(name = "status")
	private String status;
	@Column(name = "especie")
	private String species;
	@Column(name = "tipo")
	private String type;
	@Column(name = "genero")
	private String gender;
	@Column(name = "imagem")
	private String image;
	
	//@ManyToOne(fetch = FetchType.LAZY)
	@ManyToOne
	private Localizacao origin;
	
	public Personagem() {
		
	}
	
	public Personagem(Integer id, String name, String status, String species, String type, String gender,
			Localizacao origin, String image) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.type = type;
		this.gender = gender;
		this.origin = origin;
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public String getEspecie() {
		return species;
	}

	public String getTipo() {
		return type;
	}

	public String getGenero() {
		return gender;
	}

	public Localizacao getOrigem() {
		return origin;
	}

	public String getImagemURL() {
		return image;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setOrigem(Localizacao origin) {
		this.origin = origin;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "=-----------------------------="
				+ "\nPersonagem:"
				+ "\n Id = " + id 
				+ "\n Name = " + name 
				+ "\n Status = " + status 
				+ "\n Species = " + species 
				+ "\n Type = "+ type 
				+ "\n Gender = " + gender 
				+ "\n Image = " + image 
				+ "\n Origem = " + origin + "\n";
	}
	
	
	
	
	
}
