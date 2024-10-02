package br.com.jpa.estabelecimento.modelo;

import javax.persistence.Entity;

public class Fogao extends Produto{
	
	private String marca;
	private Integer quantidadeBocas;
	
	public Fogao() {
		
	}
	
	public Fogao(String marca, Integer quantidadeBocas) {
		this.marca = marca;
		this.quantidadeBocas = quantidadeBocas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQuantidadeBocas() {
		return quantidadeBocas;
	}

	public void setQuantidadeBocas(Integer quantidadeBocas) {
		this.quantidadeBocas = quantidadeBocas;
	}
	
	
	
}
