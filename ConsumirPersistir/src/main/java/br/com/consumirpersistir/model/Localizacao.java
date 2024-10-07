package br.com.consumirpersistir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localizacao")
public class Localizacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nome")
	private String name;
	@Column(name = "tipo")
	private String type;
	@Column(name = "dimensao")
	private String dimension;
	@Column(name = "url_localizacao")
	private String url;
	
	public Localizacao() {
		
	}
	
	public Localizacao(Integer id, String name, String type, String dimension, String url) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.dimension = dimension;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDimension() {
		return dimension;
	}
	
	public String getUrl() {
		return url;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "\n	Localizacao: "
				+ "\n 	Id = " + id 
				+ "\n 	Name = " + name 
				+ "\n 	Type = " + type 
				+ "\n 	Dimension = " + dimension 
				+ "\n 	Link localização =  " + url + "\n";
	}
}
