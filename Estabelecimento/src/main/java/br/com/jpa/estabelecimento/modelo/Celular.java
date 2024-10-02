package br.com.jpa.estabelecimento.modelo;

import javax.persistence.Entity;

@Entity
public class Celular extends Produto{
	
	private String marca;
	private Integer numeroCameras;
	
	public Celular() {
		
	}
	
	public Celular(String marca, Integer numeroCameras) {
		this.marca = marca;
		this.numeroCameras = numeroCameras;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Integer getNumeroCameras() {
		return numeroCameras;
	}
	
	public void setNumeroCameras(Integer numeroCameras) {
		this.numeroCameras = numeroCameras;
	}
	
	
}
